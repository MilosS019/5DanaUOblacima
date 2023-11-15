package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String playerFullName;
    public String playerPosition;
    public int FTM;
    public int FTA;
    public int PM2;
    public int PA2;
    public int PM3;
    public int PA3;
    public int REB;
    public int BLK;
    public int AST;
    public int STL;
    public int TOV;

    public Game(String[] values) {
        this.playerFullName = values[0];
        this.playerPosition = values[1];
        this.FTM = Integer.valueOf(values[2]);
        this.FTA = Integer.valueOf(values[3]);
        this.PM2 = Integer.valueOf(values[4]);
        this.PA2 = Integer.valueOf(values[5]);
        this.PM3 = Integer.valueOf(values[6]);
        this.PA3 = Integer.valueOf(values[7]);
        this.REB = Integer.valueOf(values[8]);
        this.BLK = Integer.valueOf(values[9]);
        this.AST = Integer.valueOf(values[10]);
        this.STL = Integer.valueOf(values[11]);
        this.TOV = Integer.valueOf(values[12]);
    }
}
