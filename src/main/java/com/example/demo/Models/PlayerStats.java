package com.example.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerStats {
    public String playerName;
    public int gamesPlayed;
    public float FTM;
    public float FTA;
    public float FTT;
    public float PM2;
    public float PA2;
    public float PT2;
    public float PM3;
    public float PA3;
    public float PT3;
    public float PT;
    public float REB;
    public float BLK;
    public float AST;
    public float STL;
    public float TOV;
    public float V;
    public float EFGP;
    public float TS;
    public float HAR;

    public PlayerStats(float[] stats, String playerFullName, int numOfGames) {
        this.FTM = stats[0];
        this.FTA = stats[1];
        this.FTT = (this.FTM / this.FTA) * 100;
        this.PM2 = stats[2];
        this.PA2 = stats[3];
        this.PT2 = (this.PM2 / this.PA2) * 100;
        this.PM3 = stats[4];
        this.PA3 = stats[5];
        this.PT3 = (this.PM3 / this.PA3) * 100;
        this.PT = PM2 * 2 + PM3 * 3 + FTM;
        this.REB = stats[6];
        this.BLK = stats[7];
        this.AST = stats[8];
        this.STL = stats[9];
        this.TOV = stats[10];
        this.V = calculateValorization() * 100;
        this.EFGP = calculateEffectiveFieldGoalPercentage() * 100;
        this.TS = calculateTrueShootingPercentage() * 100;
        this.HAR = calculateHollingerAssistRatio() * 100;

        this.playerName = playerFullName;
        this.gamesPlayed = numOfGames;
    }

    private float calculateValorization() {
        return (PM2 * 2 + PM3 * 3 + FTM + REB + AST + STL + BLK) - ((PA2 - PM2) * 2 + (PA3 - PM3) * 3 + FTA - FTM + TOV);
    }

    private float calculateEffectiveFieldGoalPercentage() {
        return (float) ((PM2 + PM3 + (0.5 * PM3)) / (PA2 + PA3));
    }

    private float calculateHollingerAssistRatio() {
        return (float) (this.AST / ((PA2 + PA3) + 0.475 * FTA + AST + TOV));
    }

    private float calculateTrueShootingPercentage() {
        return (float) ((PM2 * 2 + PM3 * 3 + FTM) / (2 * (PA2 + PA3 + (0.44 * FTA))));
    }
}
