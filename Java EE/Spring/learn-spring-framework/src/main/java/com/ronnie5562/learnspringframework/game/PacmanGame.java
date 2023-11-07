package com.ronnie5562.learnspringframework.game;

public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("Move up");
	}

	public void down() {
		System.out.println("Move down");
	}
	
	public void left() {
		System.out.println("Go back");
	}

	public void right() {
		System.out.println("Move forward");
	}
}
