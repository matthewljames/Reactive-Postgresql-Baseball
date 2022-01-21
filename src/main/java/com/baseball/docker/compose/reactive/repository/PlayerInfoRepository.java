package com.baseball.docker.compose.reactive.repository;

import com.baseball.docker.compose.reactive.model.PlayerInfo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface PlayerInfoRepository extends ReactiveCrudRepository<PlayerInfo, Long> {
    Flux<PlayerInfo> findPlayerInfosByTeamId(Long id);
}
