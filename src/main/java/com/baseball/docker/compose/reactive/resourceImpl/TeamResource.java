package com.baseball.docker.compose.reactive.resourceImpl;

import com.baseball.docker.compose.reactive.model.DTO.TeamInfoDTO;
import com.baseball.docker.compose.reactive.model.Team;
import com.baseball.docker.compose.reactive.model.TeamInfo;
import com.baseball.docker.compose.reactive.service.TeamInfoService;
import com.baseball.docker.compose.reactive.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/teams")
public class TeamResource {

    @Autowired
    TeamService service;

    @Autowired
    TeamInfoService teamInfoService;

    @GetMapping("/")
    public Flux<Team> getTeams(){
        return service.getTeams();
    }

    @GetMapping("/info")
    public Flux<TeamInfo> getTeamsInfo(){
        return service.getTeamsInfo();
    }

    @PostMapping("/info")
    public Mono<TeamInfo> createTeamInfo(@RequestBody Mono<TeamInfoDTO> teamInfoDTOMono){
        return teamInfoService.createTeamInfo(teamInfoDTOMono);
    }
}
