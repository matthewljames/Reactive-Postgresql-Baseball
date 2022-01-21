package com.baseball.docker.compose.reactive.service;

import com.baseball.docker.compose.reactive.model.DTO.PlayerInfoDTO;
import com.baseball.docker.compose.reactive.model.PlayerInfo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface PlayerInfoService {
    Flux<PlayerInfo> getPlayers();
    Mono<PlayerInfo> getPlayerById(Long id);
    Mono<PlayerInfo> createPlayerInfo(Mono<PlayerInfoDTO> playerInfoDTOMono);

    Flux<PlayerInfo> getPlayersByTeamId(Long id);
}
