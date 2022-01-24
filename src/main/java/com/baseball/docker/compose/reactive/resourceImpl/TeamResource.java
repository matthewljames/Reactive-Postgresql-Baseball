package com.baseball.docker.compose.reactive.resourceImpl;

import com.baseball.docker.compose.reactive.model.DTO.TeamInfoDTO;
import com.baseball.docker.compose.reactive.model.Team;
import com.baseball.docker.compose.reactive.model.TeamInfo;
import com.baseball.docker.compose.reactive.service.TeamInfoService;
import com.baseball.docker.compose.reactive.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
@RequestMapping("/api/teams")
public class TeamResource {

    @Autowired
    TeamService service;

    @Autowired
    TeamInfoService teamInfoService;

    @GetMapping("/")
    public Mono<ResponseEntity<?>> getTeams(){
        return Mono.just(ResponseEntity.ok().body(service.getTeams()));
    }

    @GetMapping("/info")
    public Mono<ResponseEntity<?>> getTeamsInfo(){
        return Mono.just(ResponseEntity.ok().body(service.getTeamsInfo()));
    }

    @PostMapping("/info")
    public Mono<ResponseEntity<?>> createTeamInfo(@RequestBody Mono<TeamInfoDTO> teamInfoDTOMono){
        URI uri = URI.create(getClass().getSimpleName() + "/createTeamInfo");
        return Mono.just(ResponseEntity.created(uri).body(teamInfoService.createTeamInfo(teamInfoDTOMono)));
    }
}
