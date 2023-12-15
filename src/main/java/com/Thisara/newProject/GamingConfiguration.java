package com.Thisara.newProject;

import com.Thisara.newProject.game.GameConsole;
import com.Thisara.newProject.game.GameRunner;
import com.Thisara.newProject.game.PackmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GameConsole game(){
        var game = new PackmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GameConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
