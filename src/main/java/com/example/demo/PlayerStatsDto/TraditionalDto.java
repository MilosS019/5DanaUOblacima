package com.example.demo.PlayerStatsDto;

import com.example.demo.Models.PlayerStats;

public class TraditionalDto {
    public FreeThrowsDto freeThrows;
    public TwoPointsDto twoPoints;
    public ThreePointsDto threePoints;
    public float points;
    public float rebounds;
    public float blocks;
    public float assists;
    public float turnovers;
    public TraditionalDto(PlayerStats playerStats) {
        this.freeThrows = new FreeThrowsDto(playerStats.FTA, playerStats.FTM, playerStats.FTT);
        this.twoPoints = new TwoPointsDto(playerStats.PA2, playerStats.PM2, playerStats.PT2);
        this.threePoints = new ThreePointsDto(playerStats.PA3, playerStats.PM3, playerStats.PT3);
        this.points = playerStats.PT;
        this.rebounds = playerStats.REB;
        this.blocks = playerStats.BLK;
        this.assists = playerStats.AST;
        this.turnovers = playerStats.TOV;
    }
}
