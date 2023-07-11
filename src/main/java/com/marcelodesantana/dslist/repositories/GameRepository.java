package com.marcelodesantana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelodesantana.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
