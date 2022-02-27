package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
    UserActions userAct = new UserActions();

        User gab = new ProUser("gab", "1234",
                new PersoInfo("Gabriel", 25, "gab@mail.com"),
                new Address("Rua Gab",7,"POA"),
                ProgLangs.JAVA, Gender.MALE, Pref.WOMEN, "9991");

        User gui = new ProUser("gui", "2345",
                new PersoInfo("Guilherme", 20, "gui@mail.com"),
                new Address("Rua Gui",8,"Cachoeirinha"),
                ProgLangs.JAVA, Gender.MALE, Pref.WOMEN, "9992");

        User luiz = new ProUser("luiz", "3456",
                new PersoInfo("Luiz", 19, "luiz@mail.com"),
                new Address("Rua Luiz",9,"POA"),
                ProgLangs.JAVA, Gender.MALE, Pref.WOMEN, "9993");

        userAct.userList.add(gab);
        userAct.userList.add(gui);
        userAct.userList.add(luiz);

        int menu = 0;

    System.out.println("""
            Bem vindo ao TinDev!
            Digite a opção desejada:
            1 - Login
            2 - Cadastro""");
    menu = scan.nextInt();
    scan.nextLine();

        switch (menu) {
            case 1 -> {
                menu = 0;
                System.out.println("Username:");
                String usernameLogin = scan.nextLine();
                for (int i=0; i<userAct.userList.size(); i++) {
                    if (usernameLogin.equals(userAct.userList.get(i).getUsername())) {
                        System.out.println("Senha:");
                        String passwordLogin = scan.nextLine();
                            if (passwordLogin.equals(userAct.userList.get(i).getPassword())) {
                                System.out.println("ACERTÔ MISERÁVI");
                            }
                    }
                    else {

                    }
                }
            }
            case 2 -> {
                menu = 0;
                userAct.registerUser();
            }
            default -> {System.out.println("Opção inválida, favor reiniciar o programa.");
            }
        }

//    while (menu != 9) {
//
//    }

    }
}
