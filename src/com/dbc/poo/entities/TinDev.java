package com.dbc.poo.entities;

import java.util.List;
import java.util.Scanner;

public class TinDev {
    public void tinDev(User user) {
        Scanner scan = new Scanner(System.in);
        Like like = new Like();
        UserActions userActions = new UserActions();

        System.out.println("""
                    \n[TINDEV]
                    1 - Escolher candidatos
                    2 - Mostrar sua lista de matches
                    3 - Mostrar sua lista de likes
                    9 - Voltar ao menu anterior""");
        int tinMenu = scan.nextInt();
        scan.nextLine();
        switch(tinMenu) {
            case 1 -> {
                List<User> availableUsers = userActions.listAvailableUsers(user);
                like.listCandidates(availableUsers, user);
            }
            case 2 -> {
                user.printMyMatches();
                tinDev(user);
            }
            case 3 ->{
                user.printMyLikes();
                tinDev(user);
            }
            case 9 -> userActions.userMenu(user);
        }


    }
}
