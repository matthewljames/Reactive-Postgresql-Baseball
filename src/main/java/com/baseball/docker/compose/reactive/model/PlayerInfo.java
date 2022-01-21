package com.baseball.docker.compose.reactive.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Player_Info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerInfo {

    @Id
    private Long id;
    @JsonProperty(value = "first_name")
    private String firstName;
    @JsonProperty(value = "last_name")
    private String lastName;
    private Integer age;
    @JsonProperty(value = "position_id")
    private Long positionId;
    @JsonProperty(value = "team_id")
    private Long teamId;
    private String handed;
}
