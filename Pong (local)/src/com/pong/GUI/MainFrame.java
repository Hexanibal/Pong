package com.pong.GUI;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	PPan pan;
	
	public MainFrame() {
		pan = new PPan();
		
		init();
		
		this.setVisible(true);
	}

	private void init() {
		this.setResizable(false);
		this.setSize(960, 540);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setContentPane(pan);
	}
	
}
