package com.pong.utils;

public class HVector {

	public int x;
	public int y;
	
	public HVector() {
		
	}
	
	public HVector(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int x() {
		return this.x;
	}
	
	public int y() {
		return this.y;
	}
	
	public void add(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public void add(HVector hvector) {
		this.x += hvector.x;
		this.y += hvector.y;
	}
}
