package com.example.Ardenas_backend.repository;

import com.example.Ardenas_backend.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository <Player, Long> {
}
