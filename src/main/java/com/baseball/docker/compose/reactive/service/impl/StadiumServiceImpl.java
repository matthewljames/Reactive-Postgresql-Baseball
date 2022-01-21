package com.baseball.docker.compose.reactive.service.impl;

import com.baseball.docker.compose.reactive.model.DTO.StadiumDTO;
import com.baseball.docker.compose.reactive.model.Stadium;
import com.baseball.docker.compose.reactive.repository.StadiumRepository;
import com.baseball.docker.compose.reactive.resourceImpl.StadiumResourceImpl;
import com.baseball.docker.compose.reactive.service.StadiumService;
import com.sun.jndi.toolkit.url.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriBuilderFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Comparator;

@Service
public class StadiumServiceImpl implements StadiumService {

    Logger logger = LoggerFactory.getLogger(StadiumResourceImpl.class);

    @Autowired
    StadiumRepository repository;

    @Override
    public Flux<Stadium> getStadiums() {
        logger.info("INSIDE GET STADIUMS SERVICE");
        return repository
                .findAll();
    }

    @Override
    public Mono<Stadium> getStadium(Long id) {
        return repository.findById(id);
    }

    @Override
    public Mono<ResponseEntity<?>> createStadium(Mono<StadiumDTO> stadiumDTOMono) {
        return createStadiumFromDTO(stadiumDTOMono)
                .map(stadium -> {
                    repository.save(stadium);
                    URI uri = URI.create("http://localhost:8080/api/stadiums/POST");
                    return ResponseEntity.created(uri).body(stadium);
                });
    }

    @Override
    public Mono<ResponseEntity<?>> deleteStadium(Long id) {
        return null;
    }

    private static Mono<Stadium> createStadiumFromDTO(Mono<StadiumDTO> stadiumDTOMono){
        return stadiumDTOMono
                .map(stadiumDTO -> {
                    Stadium stadium = new Stadium();
                    stadium.setName(stadiumDTO.getName());
                    stadium.setCity(stadiumDTO.getCity());
                    stadium.setState(stadiumDTO.getState());
                    stadium.setCapacity(stadiumDTO.getCapacity());
                    return stadium;
                        });
    }
}
