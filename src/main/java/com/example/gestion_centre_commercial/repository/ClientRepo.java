package com.example.gestion_centre_commercial.repository;

import com.example.gestion_centre_commercial.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client,Long> {
}
