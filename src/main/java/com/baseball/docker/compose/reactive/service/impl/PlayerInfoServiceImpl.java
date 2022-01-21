package com.baseball.docker.compose.reactive.service.impl;

import com.baseball.docker.compose.reactive.model.DTO.PlayerInfoDTO;
import com.baseball.docker.compose.reactive.model.PlayerInfo;
import com.baseball.docker.compose.reactive.repository.PlayerInfoRepository;
import com.baseball.docker.compose.reactive.service.PlayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class PlayerInfoServiceImpl implements PlayerInfoService {

    @Autowired
    PlayerInfoRepository repository;

    @Override
    public Flux<PlayerInfo> getPlayers() {
        return repository.findAll();
    }

    @Override
    public Mono<PlayerInfo> getPlayerById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Mono<PlayerInfo> createPlayerInfo(Mono<PlayerInfoDTO> playerInfoDTOMono) {
        return createPlayerInfoFromDTO(playerInfoDTOMono)
                .flatMap(playerInfo -> repository.save(playerInfo));
    }

    @Override
    public Flux<PlayerInfo> getPlayersByTeamId(Long id) {
        return repository.findPlayerInfosByTeamId(id);
    }

    public static Mono<PlayerInfo> createPlayerInfoFromDTO(Mono<PlayerInfoDTO> playerInfoDTOMono){
        return playerInfoDTOMono
                .map(playerInfoDTO -> {
                    PlayerInfo player = new PlayerInfo();
                    player.setFirstName(playerInfoDTO.getFirstName());
                    player.setLastName(playerInfoDTO.getLastName());
                    player.setAge(playerInfoDTO.getAge());
                    player.setTeamId(playerInfoDTO.getTeamId());
                    player.setPositionId(playerInfoDTO.getPositionId());
                    player.setHanded(playerInfoDTO.getHanded());
                    return player;
                });
    }
}
