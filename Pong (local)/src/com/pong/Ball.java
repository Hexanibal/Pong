package com.pong;

import java.awt.Color;
import java.awt.Graphics;

import com.pong.utils.HVector;

public class Ball {

	HVector loc;
	HVector velocity;
	
	public Ball() {
		loc = new HVector(Main.width / 2, Main.height / 2);
		velocity = new HVector(1, 1);
	}
	
	public void update() {
		HVector v = new HVector(loc.x + velocity.x, loc.y + velocity.y);
		
		if(v.x + 25 >= Main.width) velocity.x = -1 * velocity.x;
		if(v.x - 25 <= 0) velocity.x = -1 * velocity.x;
		if(v.y + 25 >= Main.height) velocity.y = -1 * velocity.y;
		if(v.y - 25 <= 0) velocity.y = -1 * velocity.y;
		
		loc = v;
	}
	
	public void show(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(loc.x - 25, loc.y - 25, 50, 50);
		g.setColor(Color.red);
	}
	
}
