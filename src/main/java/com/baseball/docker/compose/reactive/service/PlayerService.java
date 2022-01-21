package com.baseball.docker.compose.reactive.service;

import com.baseball.docker.compose.reactive.model.Player;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlayerService {

    Flux<Player> getPlayers();
    Mono<Player> getPlayerById(Long id);
}
