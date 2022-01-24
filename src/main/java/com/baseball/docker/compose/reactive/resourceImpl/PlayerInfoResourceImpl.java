package com.baseball.docker.compose.reactive.resourceImpl;

import com.baseball.docker.compose.reactive.model.DTO.PlayerInfoDTO;
import com.baseball.docker.compose.reactive.model.PlayerInfo;
import com.baseball.docker.compose.reactive.service.PlayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
@RequestMapping("/api/playerinfo")
public class PlayerInfoResourceImpl {

    @Autowired
    PlayerInfoService service;

    @GetMapping("/")
    public Mono<ResponseEntity<?>> getPlayerInfo(){
        return Mono.just(ResponseEntity.ok().body(service.getPlayers()));
    }


//    @GetMapping("/")
//    public Flux<PlayerInfo> getPlayerInfos(){
//        return service.getPlayers();
//    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<?>> getPlayerById(@PathVariable(value = "id") Long id){
        return Mono.just(ResponseEntity.ok().body(service.getPlayerById(id)));
    }

//    @GetMapping("/{id}")
//    public Mono<PlayerInfo> getPlayerById(@PathVariable(value = "id") Long id){
//        return service.getPlayerById(id);
//    }

    @PostMapping("/")
    public Mono<ResponseEntity<?>> createPlayer(@RequestBody Mono<PlayerInfoDTO> playerInfoDTOMono){
        URI uri = URI.create(getClass().getSimpleName() + "/createPlayer");
        return Mono.just(ResponseEntity.created(uri).body(service.createPlayerInfo(playerInfoDTOMono)));
    }

//    @PostMapping("/")
//    public Mono<PlayerInfo> createPlayer(@RequestBody Mono<PlayerInfoDTO> playerInfoDTOMono){
//        return service.createPlayerInfo(playerInfoDTOMono);
//    }
}
