package com.baseball.docker.compose.reactive.service.impl;

import com.baseball.docker.compose.reactive.model.DTO.TeamInfoDTO;
import com.baseball.docker.compose.reactive.model.TeamInfo;
import com.baseball.docker.compose.reactive.repository.TeamInfoRepository;
import com.baseball.docker.compose.reactive.service.TeamInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TeamInfoServiceImpl implements TeamInfoService {

    @Autowired
    TeamInfoRepository repository;


    @Override
    public Flux<TeamInfo> getTeams() {
        return repository.findAll();
    }

    @Override
    public Mono<TeamInfo> getTeamById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Mono<TeamInfo> createTeamInfo(Mono<TeamInfoDTO> teamInfoDTOMono) {
        return createTeamInfoFromDTO(teamInfoDTOMono)
                .flatMap(teamInfo -> repository.save(teamInfo));
    }

    public static Mono<TeamInfo> createTeamInfoFromDTO(Mono<TeamInfoDTO> teamInfoDTOMono){
        return teamInfoDTOMono
                .map(teamInfoDTO -> {
                    TeamInfo teamInfo = new TeamInfo();
                    teamInfo.setName(teamInfoDTO.getName());
                    teamInfo.setStadium_id(teamInfoDTO.getStadiumId());
                    return teamInfo;
                });

    }
}
