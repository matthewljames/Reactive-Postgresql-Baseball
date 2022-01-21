package com.baseball.docker.compose.reactive.service.impl;

import com.baseball.docker.compose.reactive.model.PlayerInfo;
import com.baseball.docker.compose.reactive.model.Stadium;
import com.baseball.docker.compose.reactive.model.Team;
import com.baseball.docker.compose.reactive.model.TeamInfo;
import com.baseball.docker.compose.reactive.service.PlayerInfoService;
import com.baseball.docker.compose.reactive.service.StadiumService;
import com.baseball.docker.compose.reactive.service.TeamInfoService;
import com.baseball.docker.compose.reactive.service.TeamService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamInfoService teamService;
    private StadiumService stadiumService;
    private PlayerInfoService playerInfoService;

    @Autowired
    TeamServiceImpl(TeamInfoService teamService, StadiumService stadiumService, PlayerInfoService playerInfoService){
        this.stadiumService = stadiumService;
        this.teamService = teamService;
        this.playerInfoService = playerInfoService;
    }

    @Override
    public Flux<Team> getTeams() {
        var allTeams = teamService.getTeams();

        return allTeams
                .flatMap(teamInfo -> {
                    Mono<Stadium> stadiumMono = stadiumService.getStadium(teamInfo.getStadium_id());
                    return stadiumMono
                            .flatMap(stadium -> {
                                Mono<List<PlayerInfo>> rosterMono = playerInfoService.getPlayersByTeamId(teamInfo.getId()).collectList();
                                return rosterMono
                                        .map(roster -> new Team(teamInfo, stadium, roster));
                            });
                });
    }

    @Override
    public Mono<ResponseEntity<?>> getTeamRoster(Long id) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<?>> getTeamById(Long id) {
        return null;
    }

    @Override
    public Flux<TeamInfo> getTeamsInfo() {
        return teamService.getTeams();
    }
}
