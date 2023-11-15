package com.example.demo.Services;

import com.example.demo.Models.Game;
import com.example.demo.Models.PlayerStats;
import com.example.demo.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerStatsService {
    @Autowired
    GameRepository gameRepository;

    public PlayerStats getStats(String playerFullName) {
        float stats[] = new float[11];
        List<Game> games = gameRepository.findAllByPlayerFullName(playerFullName);
        int gamesPlayed = games.size();
        for(Game game : games){
            stats[0] += game.FTM;
            stats[1] += game.FTA;
            stats[2] += game.PM2;
            stats[3] += game.PA2;
            stats[4] += game.PM3;
            stats[5] += game.PA3;
            stats[6] += game.REB;
            stats[7] += game.BLK;
            stats[8] += game.AST;
            stats[9] += game.STL;
            stats[10] += game.TOV;
        }

        for(int i = 0; i < 11; i++) {
            stats[i] = stats[i] / gamesPlayed;
        }

        PlayerStats playerStats = new PlayerStats(stats, playerFullName, gamesPlayed);
        return playerStats;
    }
}
