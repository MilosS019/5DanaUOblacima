package com.example.demo.PlayerStatsDto;

import com.example.demo.JsonSerializers.CustomFloatSerializer;
import com.example.demo.Models.PlayerStats;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class TraditionalDto {
    public FreeThrowsDto freeThrows;
    public TwoPointsDto twoPoints;
    public ThreePointsDto threePoints;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float points;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float rebounds;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float blocks;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float assists;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float steals;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float turnovers;
    public TraditionalDto(PlayerStats playerStats) {
        this.freeThrows = new FreeThrowsDto(playerStats.FTA, playerStats.FTM, playerStats.FTT);
        this.twoPoints = new TwoPointsDto(playerStats.PA2, playerStats.PM2, playerStats.PT2);
        this.threePoints = new ThreePointsDto(playerStats.PA3, playerStats.PM3, playerStats.PT3);
        this.points = playerStats.PT;
        this.rebounds = playerStats.REB;
        this.blocks = playerStats.BLK;
        this.assists = playerStats.AST;
        this.steals = playerStats.STL;
        this.turnovers = playerStats.TOV;
    }
}
