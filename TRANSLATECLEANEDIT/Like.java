package com.dbc.poo.TRANSLATECLEANEDIT;

import java.util.List;
import java.util.Scanner;

public class Like {
    Scanner scan = new Scanner(System.in);
    TinDev tinder = new TinDev();

    public void listCandidates(List<User> userList, User user1) {
        boolean itsAMatch = false;
        for (User userChoice : userList) {
            System.out.println(userChoice);
            System.out.println("\nDeseja dar like? (S/N)");
            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase("s") || choice.equalsIgnoreCase("sim")) {
                itsAMatch = like(user1, userChoice);
            }
        }
        System.out.println("\nNão há mais nenhum usuário disponível para dar like.");
        tinder.tinDev(user1);
    }

    public boolean like(User user1, User user2) {
        if (user1.equals(user2)) {
            System.out.println("Não é possível dar like em você.");
        } else {
            user1.getMyLikes().add(user2);
        }
        if(user2.getMyLikes().contains(user1) && user1.getMyLikes().contains(user2)) {
            System.out.println("Podemos ter um casal, pois "+user1.getPersoInfo().getRealName()+" e "+user2.getPersoInfo().getRealName()+" trocaram likes!" +
                    "Estamos analisando um possível match...");
            try {
                Thread.sleep(3000);
                Match match = new Match();
                match.addMatch(user1, user2);
                return true;
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
