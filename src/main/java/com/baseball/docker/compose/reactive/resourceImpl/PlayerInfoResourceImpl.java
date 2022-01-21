package com.baseball.docker.compose.reactive.resourceImpl;

import com.baseball.docker.compose.reactive.model.DTO.PlayerInfoDTO;
import com.baseball.docker.compose.reactive.model.PlayerInfo;
import com.baseball.docker.compose.reactive.service.PlayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/playerinfo")
public class PlayerInfoResourceImpl {

    @Autowired
    PlayerInfoService service;

    @GetMapping("/")
    public Flux<PlayerInfo> getPlayerInfos(){
        return service.getPlayers();
    }

    @GetMapping("/{id}")
    public Mono<PlayerInfo> getPlayerById(@PathVariable(value = "id") Long id){
        return service.getPlayerById(id);
    }

    @PostMapping("/")
    public Mono<PlayerInfo> createPlayer(@RequestBody Mono<PlayerInfoDTO> playerInfoDTOMono){
        return service.createPlayerInfo(playerInfoDTOMono);
    }
}
