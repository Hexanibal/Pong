package com.pong.utils;

import java.util.Random;

public class HRandom {

	Random r;
	
	public HRandom() {
		r = new Random();
	}
	
	public float nextFloat(float bounce) {
		return r.nextFloat() * bounce * 2 - bounce;
	}
	
}
