package com.example.demo;

import com.example.demo.Models.Game;
import com.example.demo.Repository.GameRepository;
import com.example.demo.Services.GamesService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private GamesService gamesService;

	@Autowired
	private GameRepository gameRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	protected InitializingBean sendDatabase() {
		return this::initializeData;
	}

	private void initializeData() throws IOException {
		List<Game> games = gamesService.getAllGames();
		for(Game game : games){
			this.gameRepository.save(game);
		}
	}
}
