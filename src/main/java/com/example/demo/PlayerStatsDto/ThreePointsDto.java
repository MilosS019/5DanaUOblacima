package com.example.demo.PlayerStatsDto;

public class ThreePointsDto {
    public float attempts;
    public float made;
    public float shootingPercentage;

    public ThreePointsDto(float pa3, float pm3, float pt3) {
        this.attempts = pa3;
        this.made = pm3;
        this.shootingPercentage = pt3;
    }
}
