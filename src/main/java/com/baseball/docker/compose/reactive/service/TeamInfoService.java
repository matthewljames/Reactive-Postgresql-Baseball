package com.baseball.docker.compose.reactive.service;

import com.baseball.docker.compose.reactive.model.DTO.TeamInfoDTO;
import com.baseball.docker.compose.reactive.model.TeamInfo;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface TeamInfoService {

    Flux<TeamInfo> getTeams();
    Mono<ResponseEntity<?>> getTeamById(Long id);
    Mono<TeamInfo> createTeamInfo(Mono<TeamInfoDTO> teamInfoDTOMono);
}
