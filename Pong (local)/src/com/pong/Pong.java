package com.pong;

import java.awt.Graphics;

public class Pong {

	private Ball ball;
	private Pad[] pads;
	
	public Pong(int width, int heidth) {
		ball = new Ball();
		pads = new Pad[2];
		pads[0] = new Pad(25, 50);
		pads[1] = new Pad(width - 50, 50);
	}
	
	public void update() {
		ball.update();
		pads[0].update();
		pads[1].update();
	}
	
	public void show(Graphics g) {
		ball.show(g);
		pads[0].show(g);
		pads[1].show(g);
	}
	
}
