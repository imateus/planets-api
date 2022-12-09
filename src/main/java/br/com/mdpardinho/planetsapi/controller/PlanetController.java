package br.com.mdpardinho.planetsapi.controller;

import br.com.mdpardinho.planetsapi.entity.Planet;
import br.com.mdpardinho.planetsapi.service.PlanetService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.*;

@RestController
@AllArgsConstructor
@RequestMapping("/planet")
public class PlanetController {
    private PlanetService planetService;

    @PostMapping
    public ResponseEntity<Planet> create(@RequestBody Planet planet) {
        return ResponseEntity.status(CREATED).body(planetService.create(planet));
    }
}
