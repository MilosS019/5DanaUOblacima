package com.example.demo.PlayerStatsDto;

public class TwoPointsDto {
    public float attempts;
    public float made;
    public float shootingPercentage;

    public TwoPointsDto(float pa2, float pm2, float pt2) {
        this.attempts = pa2;
        this.made = pm2;
        this.shootingPercentage = pt2;
    }
}
