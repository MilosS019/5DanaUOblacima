package com.example.demo.PlayerStatsDto;

public class FreeThrowsDto {
    public float attempts;
    public float made;
    public float shootingPercentage;

    public FreeThrowsDto(float fta, float ftm, float ftt) {
        this.attempts = fta;
        this.made = ftm;
        this.shootingPercentage = ftt;
    }
}
