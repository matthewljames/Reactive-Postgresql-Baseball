package com.baseball.docker.compose.reactive.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "Team_Info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamInfo {

    @Id
    private Long id;
    private Long stadium_id;
    private String name;
}
