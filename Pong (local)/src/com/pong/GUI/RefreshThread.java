package com.pong.GUI;

import com.pong.Main;

public class RefreshThread implements Runnable{

	@Override
	public void run() {
		
		for(;;){
			Main.frame.pong.update();
			Main.frame.repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
