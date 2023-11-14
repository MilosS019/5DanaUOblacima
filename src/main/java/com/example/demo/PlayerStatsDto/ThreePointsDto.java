package com.example.demo.PlayerStatsDto;

import com.example.demo.JsonSerializers.CustomFloatSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class ThreePointsDto {
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float attempts;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float made;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float shootingPercentage;

    public ThreePointsDto(float pa3, float pm3, float pt3) {
        this.attempts = pa3;
        this.made = pm3;
        this.shootingPercentage = pt3;
    }
}
