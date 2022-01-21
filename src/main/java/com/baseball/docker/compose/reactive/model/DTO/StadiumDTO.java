package com.baseball.docker.compose.reactive.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StadiumDTO {
    private String name;
    private String city;
    private String state;
    private Long capacity;
}
