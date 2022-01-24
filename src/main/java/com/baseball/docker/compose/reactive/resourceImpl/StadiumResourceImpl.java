package com.baseball.docker.compose.reactive.resourceImpl;

import com.baseball.docker.compose.reactive.model.DTO.StadiumDTO;
import com.baseball.docker.compose.reactive.model.Stadium;
import com.baseball.docker.compose.reactive.service.StadiumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/stadiums")
public class StadiumResourceImpl {

    @Autowired
    StadiumService service;

    Logger logger = LoggerFactory.getLogger(StadiumResourceImpl.class);

    @GetMapping("/")
    public Mono<ResponseEntity<?>> getStadiums(){
        logger.info("INSIDE GET STADIUMS CONTROLLER");
         return Mono.just(ResponseEntity.ok().body(service.getStadiums()));
    }

//    @GetMapping("/")
//    public Flux<Stadium> getStadiums(){
//        logger.info("INSIDE GET STADIUMS CONTROLLER");
//        return service.getStadiums();
//    }

    @PostMapping("/")
    public Mono<ResponseEntity<?>> createStadium(@RequestBody Mono<StadiumDTO> stadiumDTOMono){
        logger.info("INSIDE CREATE STADIUM CONTROLLER");
        return service.createStadium(stadiumDTOMono);
    }

//    @PostMapping("/")
//    public Mono<ResponseEntity<?>> createStadium(@RequestBody Mono<StadiumDTO> stadiumDTOMono){
//        logger.info("INSIDE CREATE STADIUM CONTROLLER");
//        return service.createStadium(stadiumDTOMono);
//    }
}
