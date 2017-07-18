package com.pong;

import com.pong.GUI.MainFrame;
import com.pong.GUI.RefreshThread;

public class Main {

	public static int width = 960;
	public static int height = 540;
	public static int framerate = 500;
	
	public static MainFrame frame;
	
	public static void main(String[] args) {
		frame = new MainFrame();
		
		Thread rf = new Thread(new RefreshThread());
		rf.run();
	}

}
