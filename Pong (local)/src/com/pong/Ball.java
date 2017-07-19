package com.pong;

import java.awt.Color;
import java.awt.Graphics;

import com.pong.utils.HRandom;
import com.pong.utils.HVector;

public class Ball {

	HVector loc;
	HVector velocity;
	float xSpeed;
	float ySpeed;

	boolean death;

	public Ball() {
		loc = new HVector(Main.width / 2, Main.height / 2);
		xSpeed = 3;
		ySpeed = 3;
		velocity = pickVelocity();
		death = false;
	}

	public void update() {
		HVector v = loc;
		v.add(velocity);
		death = false;

		/* DEATH */
		if(v.x + 25 >= Main.width + 50) {
			Main.frame.pong.death(Main.frame.pong.getPad(0));
			return;
		}

		if(v.x - 25 <= 0 - 50) {
			Main.frame.pong.death(Main.frame.pong.getPad(1));
			return;
		}

		if(v.x - (25 - xSpeed) < Main.frame.pong.getPad(0).getLoc().x + 25) death = true;

		if(v.x + (25 - xSpeed) > Main.frame.pong.getPad(1).getLoc().x) death = true;

		/* PADS */
		if(!death 
				&& v.x - 25 <= Main.frame.pong.getPad(0).getLoc().x + 25
				&& v.y >= Main.frame.pong.getPad(0).getLoc().y 
				&& v.y <= Main.frame.pong.getPad(0).getLoc().y + Main.frame.pong.getPad(0).getLength()) velocity.x = -1 * velocity.x;

		if(!death 
				&& v.x + 25 >= Main.frame.pong.getPad(1).getLoc().x 
				&& v.y >= Main.frame.pong.getPad(1).getLoc().y 
				&& v.y <= Main.frame.pong.getPad(1).getLoc().y + Main.frame.pong.getPad(1).getLength()) velocity.x = -1 * velocity.x;

		/* Y */
		if(v.y + 25 >= Main.height) velocity.y = -1 * velocity.y;
		if(v.y - 25 <= 0) velocity.y = -1 * velocity.y;

		loc.add(velocity);
	}

	public void show(Graphics g) {
		g.setColor((death) ? Color.RED : Color.WHITE);
		g.fillOval(loc.getIntX() - 25, loc.getIntY() - 25, 50, 50);
	}

	public HVector pickVelocity() {
		HVector v = new HVector();
		HRandom r = new HRandom();
		
		do {
			v.set(r.nextFloat(xSpeed), r.nextFloat(ySpeed));
		} while (!((v.x > 1 || v.x < -1) && (v.y > 0.4 || v.y < -0.4)));

		
		return v;
	}

}
