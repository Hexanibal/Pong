package com.pong.GUI;

import javax.swing.JFrame;

import com.pong.Main;
import com.pong.Pong;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	Pong pong;
	PPan pan;
	
	public MainFrame() {
		pong = new Pong(Main.width, Main.height);
		
		/*GUI*/
		pan = new PPan();
		init();
		this.setVisible(true);
		
	}

	private void init() {
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setUndecorated(false);
		this.setContentPane(pan);
		this.pack();
	}
	
}
