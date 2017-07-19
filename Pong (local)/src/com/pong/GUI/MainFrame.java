package com.pong.GUI;

import javax.swing.JFrame;

import com.pong.Main;
import com.pong.Pong;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	public Pong pong;
	HPan pan;
	
	public MainFrame() {
		pong = new Pong(Main.width, Main.height);
		
		/*GUI*/
		pan = new HPan();
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
		this.addKeyListener(new KeyManager());
	}
	
}
