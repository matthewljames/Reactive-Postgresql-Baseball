package com.baseball.docker.compose.reactive.service.impl;

import com.baseball.docker.compose.reactive.model.Player;
import com.baseball.docker.compose.reactive.model.Position;
import com.baseball.docker.compose.reactive.model.Team;
import com.baseball.docker.compose.reactive.service.*;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerInfoService playerInfoService;
    private TeamService teamService;

    @Autowired
    PlayerServiceImpl(PlayerInfoService playerInfoService,
                      TeamService teamService){
        this.playerInfoService = playerInfoService;
        this.teamService = teamService;
    }


    @Override
    public Flux<Player> getPlayers() {

        var allPlayers = playerInfoService.getPlayers();

        return allPlayers
                .flatMap(playerInfo -> {
                    Mono<Team> playerTeamMono = teamService.getTeamById(playerInfo.getTeamId());
                    return playerTeamMono
                            .map(team -> {
                                Position position = Position.valueOf(playerInfo.getPositionId());
                                return new Player(playerInfo,position,team);
                            });
                });
    }

    @Override
    public Mono<Player> getPlayerById(Long id) {
        return playerInfoService.getPlayerById(id)
                .flatMap(playerInfo -> {
                    Mono<Team> playerTeamMono = teamService.getTeamById(playerInfo.getTeamId());
                    return playerTeamMono
                            .map(team -> {
                                Position position = Position.valueOf(playerInfo.getPositionId());
                                return new Player(playerInfo,position,team);
                            });
                });
    }
}
