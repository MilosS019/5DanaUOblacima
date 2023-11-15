package com.example.demo.Controllers;

import com.example.demo.Models.Game;
import com.example.demo.Models.PlayerStats;
import com.example.demo.PlayerStatsDto.PlayerStatsDto;
import com.example.demo.Services.GamesService;
import com.example.demo.Services.PlayerStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/stats/player")
public class PlayerInfoController {

    @Autowired
    PlayerStatsService playerStatsService;

    @Autowired
    GamesService gamesService;

    @GetMapping("/{playerFullName}")
    public ResponseEntity<PlayerStatsDto> getStats(@PathVariable String playerFullName) throws IOException {
        PlayerStats playerStats = playerStatsService.getStats(playerFullName);
        return new ResponseEntity<>(new PlayerStatsDto(playerStats), HttpStatus.OK);
    }
}
