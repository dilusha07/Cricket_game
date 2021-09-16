package com.universityOfKelaniya.cricket.controller;

//import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import com.universityOfKelaniya.cricket.models.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class GameController{

    private  final static int NO_OF_TEAMS =2;
    private  final static int NO_OF_PLAYERS = 6;

    abstract protected int bat(Team battingTeam, int targetScore, Scanner scanner);

    public void playGame(){
        try (Scanner scanner = new Scanner(System.in)){
            List<Team> teams = new ArrayList<>();
            createTeams(teams, scanner);
        }
        catch (Exception e){
            System.out.println("Game abruptly finished due to and error");

        }
    }

    private void createTeams(List<Team> teams, Scanner scanner){
        for (int i=0; i< NO_OF_TEAMS; i++){
            System.out.println("Enter team " + (i+1) + "name : ");
            String input = scanner.nextLine();
            while (input ==null || input.isEmpty()){
                System.out.println("Please enter a valid name");
                input = scanner.nextLine();
            }
            Team team = new Team(input, NO_OF_PLAYERS);
            teams.add(team);
        }
    }
}
