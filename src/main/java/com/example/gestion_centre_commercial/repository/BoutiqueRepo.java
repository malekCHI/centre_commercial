package com.example.gestion_centre_commercial.repository;

import com.example.gestion_centre_commercial.entities.Boutique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoutiqueRepo extends JpaRepository<Boutique,Long> {
}
