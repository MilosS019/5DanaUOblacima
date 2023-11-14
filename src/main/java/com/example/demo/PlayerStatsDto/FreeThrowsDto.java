package com.example.demo.PlayerStatsDto;

import com.example.demo.JsonSerializers.CustomFloatSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class FreeThrowsDto {
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float attempts;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float made;
    @JsonSerialize(using = CustomFloatSerializer.class)
    public float shootingPercentage;

    public FreeThrowsDto(float fta, float ftm, float ftt) {
        this.attempts = fta;
        this.made = ftm;
        this.shootingPercentage = ftt;
    }
}
