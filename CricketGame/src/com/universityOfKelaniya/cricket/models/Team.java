package com.universityOfKelaniya.cricket.models;

import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private int totalScore;
    private int totalWickets;
    private int currentBatsman;
    private boolean hasWonToss;

    public Team(String name, int noOfPlayers){
        this.name = name;
        this.totalScore = 0;
        this.totalWickets = 0;
        this.currentBatsman = -1;
        this.hasWonToss = false;
        setPlayers(noOfPlayers);
    }

    private void setPlayers(int noOfPlayers){
        for(int i=0; i< noOfPlayers; i++){
            Player player = new Player(String.valueOf(i));
            players.add(player);
        }
    }

    public int getTotalWickets(){
        return this.totalWickets;
    }

    public int getTotalScore(){
        return this.totalScore;
    }

    public boolean HasWonToss(){
        return this.hasWonToss;
    }

    public void setHasWonToss(boolean wonToss){
        this.hasWonToss =  wonToss;
    }
}
