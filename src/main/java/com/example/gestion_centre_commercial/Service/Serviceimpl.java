package com.example.gestion_centre_commercial.Service;

import com.example.gestion_centre_commercial.entities.Centre_commercial;
import com.example.gestion_centre_commercial.repository.CentreRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Serviceimpl implements IService{
    private CentreRepo centreRepo;
    @Override
    public void ajoutCentre(Centre_commercial centre) {
        centreRepo.save(centre);

    }
}
