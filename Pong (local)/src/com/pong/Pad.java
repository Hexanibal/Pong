package com.pong;

import java.awt.Color;
import java.awt.Graphics;

import com.pong.utils.HVector;

public class Pad {

	HVector loc;
	HVector velocity;
	int length;
	int ySpeed;
	int points;
	
	public Pad(int x, int y) {
		loc = new HVector(x, y);
		velocity = new HVector(0, 0);
		length = 150;
		ySpeed = 4;
		points = 0;
	}
	
	public void update() {
		HVector v = new HVector(loc.x + velocity.x, loc.y + velocity.y * ySpeed);
		
		if(v.y + length >= Main.height) velocity.set(0, 0);
		if(v.y <= 0) velocity.set(0, 0);
		
		loc.add(velocity.x, velocity.y * ySpeed);
	}
	
	public void show(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(loc.getIntX(), loc.getIntY(), 25, length);
	}
	
	public void setVelocity(int x, int y){
		velocity.set(x, y);
	}
	
	public void addPoint(){
		points++;
		if(Main.dimPads && length >= 40) length -= 15;
	}
	
	public HVector getLoc(){
		return loc;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getPoints() {
		return points;
	}
	
}
