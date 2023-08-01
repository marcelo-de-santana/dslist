package com.marcelodesantana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelodesantana.dslist.entities.GameList;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    @Modifying
    @Query(nativeQuery = true,
         value = "UPDATE tb_belonging set position = :newPosition WHERE " +
                "list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
