package com.baseball.docker.compose.reactive.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerInfoDTO {

    private String firstName;
    private String lastName;
    private Integer age;
    private Long positionId;
    private Long teamId;
    private String handed;
}
