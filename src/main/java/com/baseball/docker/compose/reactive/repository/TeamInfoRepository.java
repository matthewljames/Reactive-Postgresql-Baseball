package com.baseball.docker.compose.reactive.repository;

import com.baseball.docker.compose.reactive.model.TeamInfo;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface TeamInfoRepository extends ReactiveCrudRepository<TeamInfo, Long> {
}
