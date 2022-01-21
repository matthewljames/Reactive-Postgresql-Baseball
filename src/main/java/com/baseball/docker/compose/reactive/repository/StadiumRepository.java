package com.baseball.docker.compose.reactive.repository;

import com.baseball.docker.compose.reactive.model.Stadium;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadiumRepository extends ReactiveCrudRepository<Stadium,Long> {
}
