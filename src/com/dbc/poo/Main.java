package com.dbc.poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OperacoesUsuario opUsuario = new OperacoesUsuario();
        Match match = new Match();

        Usuario guilherme = new Usuario("Guilherme", new DadosPessoais(20, "meuemail@gmail.com"), new Endereco("Rua marcos", 20, "Cachoeirinha"), Linguagens.JAVA, Genero.MASCULINO, Interesse.MULHER);
        Usuario marina = new Usuario("Marina", new DadosPessoais(25, "meuemail@gmail.com"), new Endereco("Rua Rogerio", 20, "Cachoeirinha"), Linguagens.JAVA, Genero.FEMININO, Interesse.AMBOS);
        Usuario joao = new Usuario("Joao", new DadosPessoais(29, "meuemail@gmail.com"), new Endereco("Rua Juliano", 20, "Gravatai"), Linguagens.JAVA, Genero.MASCULINO, Interesse.HOMEM);
        Usuario romeu = new Usuario("Romeu", new DadosPessoais(31, "meuemail@gmail.com"), new Endereco("Rua Anderson", 20, "Canoas"), Linguagens.JAVA, Genero.MASCULINO, Interesse.AMBOS);

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
            System.out.println("Digite 9 para visualizar como usuario");
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
                    DadosPessoais dados = new DadosPessoais(idade, email);
                    System.out.println("Informe seu endereço: ");
                    System.out.println("Rua: ");
                    String logradouro = sc.nextLine();
                    System.out.println("Numero da casa/apto: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Cidade: ");
                    String cidade = sc.nextLine();
                    Endereco novoEndereco = new Endereco(logradouro, numero, cidade);
                    System.out.println("Qual sua linguagem: ");
                    Linguagens linguagem = Linguagens.valueOf(sc.nextLine().toUpperCase(Locale.ROOT).replace(" ", "_"));
                    System.out.println("Qual seu genero: ");
                    Genero genero = Genero.valueOf(sc.next().toUpperCase(Locale.ROOT));
                    System.out.println("Qual seu interesse? ");
                    Interesse interesse = Interesse.valueOf(sc.next().toUpperCase(Locale.ROOT));

                    Usuario novoUsuario = new Usuario(nome, dados, novoEndereco,linguagem, genero, interesse);
                    opUsuario.cadastrarUsuario(novoUsuario);
                    break;
                case 2:
                    opUsuario.listarTodosUsuarios();
                    break;
                case 3:
                    System.out.println("Qual pessoa deseja editar?");
                    opUsuario.listarTodosUsuarios();
                    int index = sc.nextInt();
                    while(index > opUsuario.getUsuariosList().size() - 1 || index < 0){
                        System.out.println("Não existe essa pessoa, tente novamente: ");
                        index = sc.nextInt();
                    }
                    System.out.println("O que deseja editar?  1 - Nome | 2 - Dados Pessoais | 3 - Linguagem | 4 - Genero | 5 - Interesse | 6 - Endereço");
                    int opcao = sc.nextInt();
                    sc.nextLine();
                    switch (opcao) {
                        case 1:
                            Usuario usuarioEditado = new Usuario();
                            System.out.println("Digite o novo nome: ");
                            String novoNome = sc.next();
                            usuarioEditado.setNome(novoNome);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 2:
                            usuarioEditado = new Usuario();
                            System.out.println("Qual a nova idade: ");
                            int novaIdade = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Qual seu email: ");
                            String novoEmail = sc.next();
                            DadosPessoais novosDados = new DadosPessoais(novaIdade, novoEmail);
                            usuarioEditado.setDadosPessoais(novosDados);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 3:
                            usuarioEditado = new Usuario();
                            System.out.println("Digite a nova linguagem: ");
                            Linguagens novaLinguagem = Linguagens.valueOf(sc.nextLine().toUpperCase(Locale.ROOT).replace(" ", "_"));
                            usuarioEditado.setLinguagem(novaLinguagem);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 4:
                            usuarioEditado = new Usuario();
                            System.out.println("Digite o novo genero: ");
                            Genero novoGenero = Genero.valueOf(sc.next().toUpperCase(Locale.ROOT));
                            usuarioEditado.setGenero(novoGenero);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 5:
                            usuarioEditado = new Usuario();
                            System.out.println("Digite o novo interesse: ");
                            Interesse novoInteresse = Interesse.valueOf(sc.next().toUpperCase(Locale.ROOT));
                            usuarioEditado.setInteresse(novoInteresse);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 6:
                            usuarioEditado = new Usuario();
                            System.out.println("Digite o novo endereço: ");
                            System.out.println("Rua: ");
                            String rua = sc.nextLine();
                            System.out.println("Numero da casa/apto: ");
                            Integer num = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Cidade: ");
                            String novaCidade = sc.nextLine();
                            Endereco newEndereco = new Endereco(rua, num, novaCidade);
                            usuarioEditado.setEndereco(newEndereco);
                            opUsuario.editarUsuario(index,usuarioEditado);
                            break;
                        default:
                            System.out.println("Erro");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Qual pessoa deseja excluir?");
                    opUsuario.listarTodosUsuarios();
                    int id = sc.nextInt();
                    opUsuario.removerUsuarioPorIndice(id);
                    break;
                case 8:
                    throw new MyException("Programa finalizado!");
                case 9:
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }

        System.out.println("Para continuar como Usuario, faça um cadastro: ");
        System.out.println("Qual seu nome: ");
        String nome = sc.next();
        System.out.println("Qual sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual seu email: ");
        String email = sc.next();
        sc.nextLine();
        DadosPessoais dados = new DadosPessoais(idade, email);
        System.out.println("Informe seu endereço: ");
        System.out.println("Rua: ");
        String logradouro = sc.nextLine();
        System.out.println("Numero da casa/apto: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Cidade: ");
        String cidade = sc.nextLine();
        Endereco novoEndereco = new Endereco(logradouro, numero, cidade);
        System.out.println("Qual sua linguagem: ");
        Linguagens linguagem = Linguagens.valueOf(sc.nextLine().toUpperCase(Locale.ROOT).replace(" ", "_"));
        System.out.println("Qual seu genero: ");
        Genero genero = Genero.valueOf(sc.next().toUpperCase(Locale.ROOT));
        System.out.println("Qual seu interesse? ");
        Interesse interesse = Interesse.valueOf(sc.next().toUpperCase(Locale.ROOT));

        Usuario novoUsuario = new Usuario(nome, dados,novoEndereco ,linguagem, genero, interesse);
        opUsuario.cadastrarUsuario(novoUsuario);

        int opcaoMenuDois = 0;
        while(opcaoMenuDois != 9){
            System.out.println();
            System.out.println("Digite 1 para dar match");
            System.out.println("Digite 2 para listar usuarios");
            System.out.println("Digite 3 para editar seu usuario ");
            System.out.println("Digite 4 para mostrar seus match");
            System.out.println("Digite 5 para imprimir seus dados");
            System.out.println("Digite 8 para excluir seu usuario");
            System.out.println("Digite 9 para terminar");
            opcaoMenuDois = sc.nextInt();
            switch (opcaoMenuDois){
                case 1:
                    System.out.println("Gostaria de dar match com quem? ");
                    opUsuario.listarUsuariosDisponiveis(novoUsuario);
                    int index = sc.nextInt();
                    while (index > opUsuario.getUsuariosList().size() - 1 || index < 0) {
                        System.out.println("Não existe essa pessoa, tente novamente: ");
                        index = sc.nextInt();
                    }
                    match.darMatch(novoUsuario, opUsuario.getUsuariosList().get(index));
                    break;
                case 2:
                    opUsuario.listarTodosUsuarios();
                    break;
                case 3:
                    System.out.println("O que deseja editar?  1 - Nome | 2 Dados Pessoais | 3- Linguagem | 4 - Genero | 5 - Interesse | 6 - Endereço");
                    int opcao = sc.nextInt();
                    sc.nextLine();
                    switch (opcao) {
                        case 1:
                            Usuario usuarioEditado = new Usuario();
                            System.out.println("Digite o novo nome: ");
                            String novoNome = sc.next();
                            usuarioEditado.setNome(novoNome);
                            novoUsuario.editarMeuUsuario(usuarioEditado);
                            break;
                        case 2:
                            usuarioEditado = new Usuario();
                            System.out.println("Qual a nova idade: ");
                            int novaIdade = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Qual seu email: ");
                            String novoEmail = sc.next();
                            DadosPessoais novosDados = new DadosPessoais(novaIdade, novoEmail);
                            usuarioEditado.setDadosPessoais(novosDados);
                            novoUsuario.editarMeuUsuario(usuarioEditado);
                            break;
                        case 3:
                            usuarioEditado = new Usuario();
                            System.out.println("Digite a nova linguagem: ");
                            Linguagens novaLinguagem = Linguagens.valueOf(sc.nextLine().toUpperCase(Locale.ROOT).replace(" ", "_"));
                            usuarioEditado.setLinguagem(novaLinguagem);
                            novoUsuario.editarMeuUsuario(usuarioEditado);
                            break;
                        case 4:
                            usuarioEditado = new Usuario();
                            System.out.println("Digite o novo genero: ");
                            Genero novoGenero = Genero.valueOf(sc.next().toUpperCase(Locale.ROOT));
                            usuarioEditado.setGenero(novoGenero);
                            novoUsuario.editarMeuUsuario(usuarioEditado);
                            break;
                        case 5:
                            usuarioEditado = new Usuario();
                            System.out.println("Digite o novo interesse: ");
                            Interesse novoInteresse = Interesse.valueOf(sc.next().toUpperCase(Locale.ROOT));
                            usuarioEditado.setInteresse(novoInteresse);
                            novoUsuario.editarMeuUsuario(usuarioEditado);
                            break;
                        case 6:
                            usuarioEditado = new Usuario();
                            System.out.println("Digite o novo endereço: ");
                            System.out.println("Rua: ");
                            String rua = sc.nextLine();
                            System.out.println("Numero da casa/apto: ");
                            Integer num = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Cidade: ");
                            String novaCidade = sc.nextLine();
                            Endereco newEndereco = new Endereco(rua, num, novaCidade);
                            usuarioEditado.setEndereco(newEndereco);
                            novoUsuario.editarMeuUsuario(usuarioEditado);
                            break;
                        default:
                            System.out.println("Erro");
                            break;
                    }
                    break;
                case 4:{
                    match.imprimirMeusMatch(novoUsuario);
                    break;
                }
                case 5:{
                    novoUsuario.imprimirMeusDados();
                }
                case 8:
                    throw new MyException("Conta excluída com sucesso! finalizando programa...");
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

