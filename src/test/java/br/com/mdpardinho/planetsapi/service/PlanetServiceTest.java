package br.com.mdpardinho.planetsapi.service;

import static br.com.mdpardinho.planetsapi.service.common.PlanetConstants.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import br.com.mdpardinho.planetsapi.entity.Planet;
import br.com.mdpardinho.planetsapi.repository.PlanetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class PlanetServiceTest {
    @InjectMocks
    private PlanetService planetService;

    @Mock
    private PlanetRepository planetRepository;

    @Test
    public void createPlanet_WithValidData_ReturnsPlanet(){
        when(planetRepository.save(PLANET)).thenReturn(PLANET);

        Planet sut = planetService.create(PLANET);

        assertThat(sut).isEqualTo(PLANET);
    }
}
