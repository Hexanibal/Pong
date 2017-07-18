package com.pong;

import java.awt.Color;
import java.awt.Graphics;

import com.pong.utils.HVector;

public class Ball {

	HVector loc;
	
	public Ball() {
		loc = new HVector(Main.width / 2, Main.height / 2);
	}
	
	public void update() {
		
	}
	
	public void show(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(loc.x - 25, loc.y - 25, 50, 50);
		g.setColor(Color.red);
	}
	
}
