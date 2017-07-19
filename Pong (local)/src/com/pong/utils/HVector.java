package com.pong.utils;

public class HVector {

	public float x;
	public float y;
	
	public HVector() {
		
	}
	
	public HVector(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void set(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float x() {
		return this.x;
	}
	
	public float y() {
		return this.y;
	}
	
	public void add(float x, float y) {
		this.x += x;
		this.y += y;
	}
	
	public void add(HVector hvector) {
		this.x += hvector.x;
		this.y += hvector.y;
	}
	
	public String toString() {
		return "x: " + x + " y: " + y;
	}
	
	public int getIntX() {
		return (int) x;
	}
	
	public int getIntY() {
		return (int) y;
	}
	
//	public int x;
//	public int y;
//	
//	public HVector() {
//		
//	}
//	
//	public HVector(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//	public void set(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//	public int x() {
//		return this.x;
//	}
//	
//	public int y() {
//		return this.y;
//	}
//	
//	public void add(int x, int y) {
//		this.x += x;
//		this.y += y;
//	}
//	
//	public void add(HVector hvector) {
//		this.x += hvector.x;
//		this.y += hvector.y;
//	}
//	
//	public String toString() {
//		return "x: " + x + " y: " + y;
//	}
}
