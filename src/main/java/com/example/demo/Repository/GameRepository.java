package com.example.demo.Repository;

import com.example.demo.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findAllByPlayerFullName(String playerFullName);
}