package com.baseball.docker.compose.reactive.resourceImpl;

import com.baseball.docker.compose.reactive.model.Player;
import com.baseball.docker.compose.reactive.service.impl.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/player")
public class PlayerResourceImpl {

    @Autowired
    PlayerServiceImpl service;


    @GetMapping
    public Mono<ResponseEntity<?>> getPlayers(){
        return Mono.just(ResponseEntity.ok().body(service.getPlayers()));
    }

//    @GetMapping
//    public Flux<Player> getPlayers(){
//        return service.getPlayers();
//    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<?>> getPlayerById(@PathVariable(value = "id") Long id){
        return Mono.just(ResponseEntity.ok().body(service.getPlayerById(id)));
    }
//    @GetMapping("/{id}")
//    public Mono<Player> getPlayerById(@PathVariable(value = "id") Long id){
//        return service.getPlayerById(id);
//    }
}
