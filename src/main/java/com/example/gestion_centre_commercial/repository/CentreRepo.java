package com.example.gestion_centre_commercial.repository;

import com.example.gestion_centre_commercial.entities.Centre_commercial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentreRepo extends JpaRepository<Centre_commercial,Long> {
}
