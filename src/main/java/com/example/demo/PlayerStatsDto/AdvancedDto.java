package com.example.demo.PlayerStatsDto;

import com.example.demo.JsonSerializers.CustomFloatSerializer;
import com.example.demo.Models.PlayerStats;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class AdvancedDto {
    @JsonSerialize(using = CustomFloatSerializer.class)
    public Float valorization;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public Float effectiveFieldGoalPercentage;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public Float trueShootingPercentage;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public Float hollingerAssistRatio;
    public AdvancedDto(PlayerStats playerStats) {
        this.valorization = playerStats.V;
        this.effectiveFieldGoalPercentage = playerStats.EFGP;
        this.trueShootingPercentage = playerStats.TS;
        this.hollingerAssistRatio = playerStats.HAR;
    }
}
