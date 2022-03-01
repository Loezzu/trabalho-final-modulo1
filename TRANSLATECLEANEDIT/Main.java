package com.dbc.poo.TRANSLATECLEANEDIT;
import java.util.Scanner;
public class Main {


//EDITAR MENU FREE E PRO


    public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
    UserActions userAct = new UserActions();


        User gab = new ProUser("gab", "1234",
                new PersoInfo("Gabriel", 25, "gab@mail.com"),
                new Address("Rua Gab",7,"POA"),
                ProgLangs.JAVA, Gender.MALE, Pref.WOMEN, "9991");

        User gui = new FreeUser("gui", "2345",
                new PersoInfo("Guilherme", 20, "gui@mail.com"),
                new Address("Rua Gui",8,"Cachoeirinha"),
                ProgLangs.JAVA, Gender.MALE, Pref.WOMEN);

        User luiz = new ProUser("luiz", "3456",
                new PersoInfo("Luiz", 19, "luiz@mail.com"),
                new Address("Rua Luiz",9,"POA"),
                ProgLangs.JAVA, Gender.MALE, Pref.WOMEN, "9993");

        userAct.userList.add(gab);
        userAct.userList.add(gui);
        userAct.userList.add(luiz);

        userAct.appInit();
    }
}

