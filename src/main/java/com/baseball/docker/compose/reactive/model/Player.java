package com.baseball.docker.compose.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private PlayerInfo playerInfo;
    private Position position;
    private Team team;
}
