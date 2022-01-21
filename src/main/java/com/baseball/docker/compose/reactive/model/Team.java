package com.baseball.docker.compose.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    private TeamInfo teamInfo;
    private Stadium stadium;
    protected List<PlayerInfo> roster;

    public Team(TeamInfo teamInfo, Stadium stadium){
        roster = new ArrayList<>();
        this.teamInfo = teamInfo;
        this.stadium = stadium;
    }
}
