package br.com.mdpardinho.planetsapi.repository;

import br.com.mdpardinho.planetsapi.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
