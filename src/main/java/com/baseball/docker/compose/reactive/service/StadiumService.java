package com.baseball.docker.compose.reactive.service;

import com.baseball.docker.compose.reactive.model.DTO.StadiumDTO;
import com.baseball.docker.compose.reactive.model.Stadium;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StadiumService {

    Flux<Stadium> getStadiums();
    Mono<Stadium> getStadium(Long id);
    Mono<ResponseEntity<?>> createStadium(Mono<StadiumDTO> stadiumDTOMono);
    Mono<ResponseEntity<?>> deleteStadium(Long id);
}
