package com.baseball.docker.compose.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stadium {

    @Id
    private Long id;
    private String name;
    private String city;
    private String state;
    private Long capacity;
}
