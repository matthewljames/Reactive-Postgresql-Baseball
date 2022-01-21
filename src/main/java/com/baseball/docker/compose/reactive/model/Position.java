package com.baseball.docker.compose.reactive.model;

public enum Position {
    PITCHER(1,"Pitcher", "P"),
    CATCHER(2,"Catcher", "C"),
    FIRST_BASE(3,"First Base", "1B"),
    SECOND_BASE(4,"Second Base", "2B"),
    THIRD_BASE(5,"Third Base", "3B"),
    SHORT_STOP(6,"Short Stop", "SS"),
    LEFT_FIELDER(7,"Left Fielder", "LF"),
    CENTER_FIELDER(8,"Center Fielder", "CF"),
    RIGHT_FIELDER(9,"Right Fielder", "RF");

    private final int positionId;
    private final String positionText;
    private final String positionAbreviation;

    Position(int positionId, String positionText, String positionAbreviation){
        this.positionId = positionId;
        this.positionText = positionText;
        this.positionAbreviation = positionAbreviation;
    }

    public String getPositionText(){return positionText;}
    public String getPositionAbreviation(){return positionAbreviation;}
    public int getPositionId(){return positionId;}
}
