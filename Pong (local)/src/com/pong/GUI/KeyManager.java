package com.pong.GUI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.pong.Main;

public class KeyManager implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		char c = e.getKeyChar();
		if(c == 'z') Main.frame.pong.getPad(0).setVelocity(0, -1);
		if(c == 's') Main.frame.pong.getPad(0).setVelocity(0, 1);
		if(e.getKeyCode() == 38) Main.frame.pong.getPad(1).setVelocity(0, -1);
		if(e.getKeyCode() == 40) Main.frame.pong.getPad(1).setVelocity(0, 1);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		char c = e.getKeyChar();
		if(c == 'z') Main.frame.pong.getPad(0).setVelocity(0, 0);
		if(c == 's') Main.frame.pong.getPad(0).setVelocity(0, 0);
		if(e.getKeyCode() == 38) Main.frame.pong.getPad(1).setVelocity(0, 0);
		if(e.getKeyCode() == 40) Main.frame.pong.getPad(1).setVelocity(0, 0);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
