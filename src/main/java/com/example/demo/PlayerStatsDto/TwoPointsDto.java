package com.example.demo.PlayerStatsDto;

import com.example.demo.JsonSerializers.CustomFloatSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class TwoPointsDto {
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float attempts;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float made;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float shootingPercentage;

    public TwoPointsDto(float pa2, float pm2, float pt2) {
        this.attempts = pa2;
        this.made = pm2;
        this.shootingPercentage = pt2;
    }
}
