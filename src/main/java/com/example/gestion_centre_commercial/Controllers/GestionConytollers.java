package com.example.gestion_centre_commercial.Controllers;

import com.example.gestion_centre_commercial.Service.IService;
import com.example.gestion_centre_commercial.entities.Centre_commercial;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GestionConytollers {
    private IService iService;

    @PostMapping("/ajoutCentre")
    @ResponseBody
    void ajoutCentre(@RequestBody Centre_commercial centre_commercial) {
         iService.ajoutCentre(centre_commercial);
    }
}
