package com.baseball.docker.compose.reactive.service;

import com.baseball.docker.compose.reactive.model.Team;
import com.baseball.docker.compose.reactive.model.TeamInfo;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TeamService {

    Flux<Team> getTeams();
    Mono<ResponseEntity<?>> getTeamRoster(Long id);
    Mono<ResponseEntity<?>> getTeamById(Long id);

    Flux<TeamInfo> getTeamsInfo();
}
