package com.dbc.poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OperacoesUsuario opUsuario = new OperacoesUsuario();

        UsuarioComum guilherme = new UsuarioComum("Guilherme", 20, "meuemail@gmail.com", Linguagens.JAVA, Genero.MASCULINO, Interesse.MULHER);
        UsuarioComum marina = new UsuarioComum("Marina", 21, "meuemail@gmail.com", Linguagens.JAVA, Genero.FEMININO, Interesse.AMBOS);
        UsuarioComum joao = new UsuarioComum("Joao", 28, "meuemail@gmail.com", Linguagens.JAVA, Genero.MASCULINO, Interesse.HOMEM);
        UsuarioComum romeu = new UsuarioComum("Romeu", 19, "meuemail@gmail.com", Linguagens.JAVA, Genero.MASCULINO, Interesse.AMBOS);

        opUsuario.cadastrarUsuario(guilherme);
        opUsuario.cadastrarUsuario(marina);
        opUsuario.cadastrarUsuario(joao);
        opUsuario.cadastrarUsuario(romeu);


        int opcaoMenu = 0;
        while (opcaoMenu != 9) {
            System.out.println();
            System.out.println("Digite 1 para criar pessoa");
            System.out.println("Digite 2 para listar pessoas");
            System.out.println("Digite 3 para editar uma pessoa");
            System.out.println("Digite 4 para excluir pessoas");
            System.out.println("Digite 8 para parar o programa");
            System.out.println("Digite 9 para vizualizar como usuario");
            opcaoMenu = sc.nextInt();
            sc.nextLine();
            switch (opcaoMenu) {
                case 1:
                    System.out.println();
                    System.out.println("Qual seu nome: ");
                    String nome = sc.next();
                    System.out.println("Qual sua idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Qual seu email: ");
                    String email = sc.next();
                    sc.nextLine();
                    System.out.println("Qual sua linguagem: ");
                    Linguagens linguagem = Linguagens.valueOf(sc.nextLine().toUpperCase(Locale.ROOT).replace(" ", "_"));
                    System.out.println("Qual seu genero: ");
                    Genero genero = Genero.valueOf(sc.next().toUpperCase(Locale.ROOT));
                    System.out.println("Qual seu interesse? ");
                    Interesse interesse = Interesse.valueOf(sc.next().toUpperCase(Locale.ROOT));

                    UsuarioComum novoUsuario = new UsuarioComum(nome, idade, email, linguagem, genero, interesse);
                    opUsuario.cadastrarUsuario(novoUsuario);
                    break;
                case 2:
                    opUsuario.listarUsuarios();
                    break;
                case 3:
                    System.out.println("Qual pessoa deseja editar?");
                    opUsuario.listarUsuarios();
                    int index = sc.nextInt();
                    while(index > opUsuario.getUsuariosList().size() - 1 || index < 0){
                        System.out.println("Não existe essa pessoa, tente novamente: ");
                        index = sc.nextInt();
                    }
                    System.out.println("O que deseja editar?  1 - nome | 2 - idade | 3 - email | 4 - linguagem | 5 - genero | 6 - interesse");
                    int opcao = sc.nextInt();
                    sc.nextLine();
                    switch (opcao) {
                        case 1:
                            UsuarioComum usuarioEditado = new UsuarioComum();
                            System.out.println("Digite o novo nome: ");
                            String novoNome = sc.next();
                            usuarioEditado.setNome(novoNome);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 2:
                            usuarioEditado = new UsuarioComum();
                            System.out.println("Digite a nova idade: ");
                            Integer novaIdade = sc.nextInt();
                            usuarioEditado.setIdade(novaIdade);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 3:
                            usuarioEditado = new UsuarioComum();
                            System.out.println("Digite o novo email: ");
                            String novoEmail = sc.next();
                            usuarioEditado.setEmail(novoEmail);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 4:
                            usuarioEditado = new UsuarioComum();
                            System.out.println("Digite a nova linguagem: ");
                            Linguagens novaLinguagem = Linguagens.valueOf(sc.nextLine().toUpperCase(Locale.ROOT).replace(" ", "_"));
                            usuarioEditado.setLinguagem(novaLinguagem);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 5:
                            usuarioEditado = new UsuarioComum();
                            System.out.println("Digite o novo genero: ");
                            Genero novoGenero = Genero.valueOf(sc.next().toUpperCase(Locale.ROOT));
                            usuarioEditado.setGenero(novoGenero);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 6:
                            usuarioEditado = new UsuarioComum();
                            System.out.println("Digite o novo interesse: ");
                            Interesse novoInteresse = Interesse.valueOf(sc.next().toUpperCase(Locale.ROOT));
                            usuarioEditado.setInteresse(novoInteresse);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        default:
                            System.out.println("Erro");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Qual pessoa deseja excluir?");
                    opUsuario.listarUsuarios();
                    int id = sc.nextInt();
                    opUsuario.removerUsuarioPorIndice(id);
                    break;
                case 8:
                    throw new MyException("Programa finalizadoo!");
                case 9:
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }


        int opcaoMenuDois = 0;
        while(opcaoMenuDois != 9){
            System.out.println();
            System.out.println("Digite 1 para dar match");
            System.out.println("Digite 9 para terminar");
            opcaoMenuDois = sc.nextInt();
            switch (opcaoMenuDois){
                case 1:
                    System.out.println("Gostaria de dar match com quem? ");
                    opUsuario.listarUsuariosDisponiveis(guilherme);
                    int index = sc.nextInt();
                    while (index > opUsuario.getUsuariosList().size() - 1 || index < 0) {
                        System.out.println("Não existe essa pessoa, tente novamente: ");
                        index = sc.nextInt();
                    }
                    guilherme.darMatch(opUsuario.getUsuariosList().get(index));
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }


        sc.close();
    }
}

