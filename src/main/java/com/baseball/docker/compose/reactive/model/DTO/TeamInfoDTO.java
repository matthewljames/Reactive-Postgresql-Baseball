package com.baseball.docker.compose.reactive.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamInfoDTO {

    private Long stadiumId;
    private String name;
}
