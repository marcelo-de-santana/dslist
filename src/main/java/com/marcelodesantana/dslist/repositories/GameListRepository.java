package com.marcelodesantana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelodesantana.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
