package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserActions implements Actions{
    final List<User> userList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void registerUser() {
        System.out.println("Seu nome:");
        String realName = scan.nextLine();
        System.out.println("Sua idade:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Seu e-mail:");
        String email = scan.nextLine();

        PersoInfo persoInfo = new PersoInfo(realName, age, email);

        System.out.println("Rua: ");
        String street = scan.nextLine();
        System.out.println("Número da casa: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.println("Cidade: ");
        String city = scan.nextLine();

        Address address = new Address(street, number, city);

        System.out.println("Escolha seu username:");
        String username = scan.nextLine();
        System.out.println("Escolha uma senha:");
        String password = scan.nextLine();
        System.out.println("""
                        Qual sua linguagem de programação favorita?
                        1 - JAVASCRIPT,
                        2 - JAVA,
                        3 - PHP,
                        4 - C,
                        5 - PYTHON,
                        6 - TYPESCRIPT,
                        7 - RUBY;""");
        ProgLangs progLangs = ProgLangs.values()[scan.nextInt()-1];
        System.out.println("""
                        Qual seu gênero?
                        1 - MASCULINO,
                        2 - FEMININO;""");
        Gender gender = Gender.values()[scan.nextInt()-1];
        System.out.println("""
                        Você possui preferência por:
                        1 - HOMENS,
                        2 - MULHERES,
                        3 - AMBOS;""");
        Pref pref = Pref.values()[scan.nextInt()-1];

        int pro;
        System.out.println("""
                Você deseja assinar o plano pro?
                1 - SIM
                2 - NÃO""");
        pro = scan.nextInt();
        scan.nextLine();

        switch(pro) {
            case 1 -> {
                System.out.println("Digite seu WhatsApp:");
                String whatsApp = scan.nextLine();
                User user = new ProUser(username, password, persoInfo, address, progLangs, gender, pref, whatsApp);
                userList.add(user);
            }
            case 2 -> {
                User user = new FreeUser(username, password, persoInfo, address, progLangs, gender, pref);
                userList.add(user);
            }
        }
    }
    public void listUsers() {
        System.out.println(userList);
    }
    public void listCandidates() {

    }
    public void updateUser(User user) {
//        int editMenu = 0;
//        System.out.println("""
//                O que deseja alterar?
//                1 - Username
//                2 - Senha
//                3 - Informações pessoais
//                4 - Endereço
//                5 - Linguagem
//                6 - Gênero
//                7 - Preferências""");
//        switch(editMenu) {
//            case 1 -> {
//                System.out.println("Escolha seu novo username:");
//                user.setUsername(scan.nextLine());
//            }
//            case 2 -> {
//            }
//        }
    }
    public void deleteUser(User user) {

    }
}
