package com.example.demo.PlayerStatsDto;

import com.example.demo.Models.PlayerStats;
import com.fasterxml.jackson.annotation.JsonFormat;

public class AdvancedDto {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "0.0")
    public float valorization;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "0.0")
    public float effectiveFieldGoalPercentage;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "0.0")
    public float trueShootingPercentage;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "0.0")
    public float hollingerAssistRatio;
    public AdvancedDto(PlayerStats playerStats) {
        this.valorization = playerStats.V;
        this.effectiveFieldGoalPercentage = playerStats.EFGP;
        this.trueShootingPercentage = playerStats.TS;
        this.hollingerAssistRatio = playerStats.HAR;
    }
}
