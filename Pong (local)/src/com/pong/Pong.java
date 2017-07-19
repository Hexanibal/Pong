package com.pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Pong {

	private Ball ball;
	private Pad[] pads;
	private Font font = new Font("Courier", Font.BOLD, 40);
	
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
		showScore(g);
		ball.show(g);
		pads[0].show(g);
		pads[1].show(g);
	}
	
	public void death(Pad pad){
		pad.addPoint();
		ball = new Ball();
	}
	
	public Pad getPad(int index){
		return pads[index];
	}
	
	public void showScore(Graphics g){
		g.setColor(Color.WHITE);
		g.setFont(font);
		g.drawString(String.valueOf(pads[0].getPoints()), 23, 40);
		g.drawString(String.valueOf(pads[1].getPoints()), Main.width - 20 - 30, 40);
	}
	
}
