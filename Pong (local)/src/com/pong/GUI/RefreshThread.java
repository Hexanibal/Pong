package com.pong.GUI;

import com.pong.Main;

public class RefreshThread implements Runnable{

	@Override
	public void run() {
		
		int i = 1000 / Main.framerate;
		
		for(;;){
			Main.frame.pong.update();
			Main.frame.repaint();
			
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
