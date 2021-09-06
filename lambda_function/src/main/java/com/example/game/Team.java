package com.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public void addNewParticipant (T participant){
        participants.add(participant);
        System.out.println("New gamer was added: " + participant.getName());
    }

    public void playWith(Team<T> team) {
        String winnerName;
        System.out.println(this.name + " vs " + team.name);
        Random random = new Random();
        int i = random.nextInt(2);
        if(i==0){
            winnerName = this.name;
        }
        else {
            winnerName = team.name;
        }
        System.out.println("Team wins: " + winnerName);
    }
}
