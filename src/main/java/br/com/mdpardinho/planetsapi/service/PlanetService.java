package br.com.mdpardinho.planetsapi.service;

import br.com.mdpardinho.planetsapi.entity.Planet;
import br.com.mdpardinho.planetsapi.repository.PlanetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlanetService {

    private PlanetRepository planetRepository;

    public Planet create(Planet planet){
        return planetRepository.save(planet);
    }
}
