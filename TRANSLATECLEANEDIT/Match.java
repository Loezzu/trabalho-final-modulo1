package com.dbc.poo.TRANSLATECLEANEDIT;

public class Match {
    public void addMatch(User user1, User user2) {
        if (user1.getProgLangs().equals(user2.getProgLangs())) {
            user1.getMyMatches().add(user2);
            user2.getMyMatches().add(user1);
            System.out.println("Deu match!");
        } else {
            System.out.println("Deu ruim!");
        }
    }
}
