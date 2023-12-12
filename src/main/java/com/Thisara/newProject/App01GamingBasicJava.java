package com.Thisara.newProject;

import com.Thisara.newProject.game.GameRunner;
import com.Thisara.newProject.game.MarioGame;
import com.Thisara.newProject.game.PackmanGame;
import com.Thisara.newProject.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PackmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
