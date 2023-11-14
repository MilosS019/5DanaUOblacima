package com.example.demo.PlayerStatsDto;

import com.example.demo.Models.PlayerStats;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerStatsDto {
    public String playerName;
    public int gamesPlayed;
    public TraditionalDto traditional;
    public AdvancedDto advanced;

    public PlayerStatsDto(PlayerStats playerStats){
        this.playerName = playerStats.playerName;
        this.gamesPlayed = playerStats.gamesPlayed;
        this.traditional = new TraditionalDto(playerStats);
        this.advanced = new AdvancedDto(playerStats);
    }
}
