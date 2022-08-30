package com.example.Ardenas_backend.repository;

import com.example.Ardenas_backend.model.GameRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRoleRepository extends JpaRepository<GameRole, Long> {
}
