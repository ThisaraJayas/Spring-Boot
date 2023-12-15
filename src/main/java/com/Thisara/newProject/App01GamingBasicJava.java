package com.Thisara.newProject;

import com.Thisara.newProject.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		try(var Context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			Context.getBean(GameConsole.class).up();
			Context.getBean(GameRunner.class).run();
		}


//		//var game = new MarioGame();
//		//var game = new SuperContraGame();
//		var game = new PackmanGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();

	}

}
