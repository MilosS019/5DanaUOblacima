package com.example.demo.Services;

import com.example.demo.Models.Game;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GamesService {
    public List<Game> getAllGames() throws IOException {
        List<Game>games = new ArrayList<>();
        Resource resource = new ClassPathResource("L9HomeworkChallengePlayersInput.csv");
        InputStream inputStream = resource.getInputStream();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                games.add(new Game(values));
            }

        }
        return games;
    }
}
