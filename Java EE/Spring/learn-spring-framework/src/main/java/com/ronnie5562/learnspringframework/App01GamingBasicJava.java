package com.ronnie5562.learnspringframework;

import com.ronnie5562.learnspringframework.game.GameRunner;
import com.ronnie5562.learnspringframework.game.MarioGame;
import com.ronnie5562.learnspringframework.game.PacmanGame;
import com.ronnie5562.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		var game = new PacmanGame();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
