package com.pong.GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.pong.Main;

@SuppressWarnings("serial")
public class PPan extends JPanel {

	public PPan() {
		
	}
	
	public void paintComponent(Graphics g) {
		resetBackground(g);
		Main.frame.pong.show(g);
	}
	
	private void resetBackground(Graphics g) {
		g.setColor(new Color(40, 40, 40));
		g.fillRect(0, 0, Main.width, Main.height);
	}
	
}