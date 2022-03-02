package com.dbc.poo.TRANSLATECLEANEDIT;

import java.util.List;
import java.util.Scanner;

public class TinDev {
    public void tinDev(User user) {
        Scanner scan = new Scanner(System.in);
        Match match = new Match();
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
            case 2 -> user.printMyMatches();
            case 3 -> user.printMyLikes();
            case 9 -> userActions.userMenu(user);
        }


    }
}
