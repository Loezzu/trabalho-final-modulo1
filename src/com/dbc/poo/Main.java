package com.dbc.poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OperacoesUsuario opUsuario = new OperacoesUsuario();


        Match match = new Match();
        Match match2 = new Match();
        Like like = new Like();



        UsuarioFree guilherme = new UsuarioFree("Guilherme", new DadosPessoais(20, "meuemail@gmail.com"), new Endereco("Rua marcos", 20, "Cachoeirinha"), Linguagens.JAVA, Genero.MASCULINO, Interesse.MULHER);
        UsuarioFree marina = new UsuarioFree("Marina", new DadosPessoais(25, "meuemail@gmail.com"), new Endereco("Rua Rogerio", 20, "Cachoeirinha"), Linguagens.JAVA, Genero.FEMININO, Interesse.AMBOS);
        UsuarioFree joao = new UsuarioFree("Joao", new DadosPessoais(29, "meuemail@gmail.com"), new Endereco("Rua Juliano", 20, "Gravatai"), Linguagens.JAVA, Genero.MASCULINO, Interesse.HOMEM);
        UsuarioFree romeu = new UsuarioFree("Romeu", new DadosPessoais(31, "meuemail@gmail.com"), new Endereco("Rua Anderson", 20, "Canoas"), Linguagens.JAVA, Genero.MASCULINO, Interesse.AMBOS);
        UsuarioPro julio = new UsuarioPro("Julio", new DadosPessoais(31, "meuemail@gmail.com"), new Endereco("Rua Anderson", 20, "Canoas"), Linguagens.JAVA, Genero.MASCULINO, Interesse.AMBOS, "aaaa");

        opUsuario.cadastrarUsuario(guilherme);
        opUsuario.cadastrarUsuario(marina);
        opUsuario.cadastrarUsuario(joao);
        opUsuario.cadastrarUsuario(romeu);
        opUsuario.cadastrarUsuario(julio);


        int opcaoMenu = 0;
        while (opcaoMenu != 9) {
            System.out.println();
            System.out.println("Digite 1 para criar pessoa");
            System.out.println("Digite 2 para listar pessoas");
            System.out.println("Digite 3 para editar uma pessoa");
            System.out.println("Digite 4 para excluir pessoas");
            System.out.println("Digite 5 para simular Match");
            System.out.println("Digite 6 para listar Matchs");
            System.out.println("Digite 7 para dar like");
            System.out.println("Digite 10 para imprimir likes");
            System.out.println("Digite 8 para parar o programa");
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

                    //System.out.println("UsuarioPro: 1 - sim | 2 - não");
                    System.out.println("Qual tipo de usuário deseja cadastrar: \n" +
                                        "1 - Usuário Comum \n" +
                                        "2 - Usuário Pro \n");
                    int escolhaDeUsuario = sc.nextInt();
                    if (escolhaDeUsuario == 1) {
                        UsuarioFree novoUsuario = new UsuarioFree(nome, dados, novoEndereco,linguagem, genero, interesse);
                        opUsuario.cadastrarUsuario(novoUsuario);
                    } else if (escolhaDeUsuario == 2) {
                        System.out.println("Informe seu Whatsapp: ");
                        String whatsapp = sc.next();
                        UsuarioPro novoUsuario = new UsuarioPro(nome, dados, novoEndereco,linguagem, genero, interesse, whatsapp);
                        opUsuario.cadastrarUsuario(novoUsuario);

                    }

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
                    if(opUsuario.getUsuariosList().get(index) instanceof UsuarioPro){
                        System.out.println("O que deseja editar?  1 - Nome | 2 - Dados Pessoais | 3 - Linguagem | 4 - Genero | 5 - Interesse | 6 - Endereço | 7 - whatsapp");
                    }else{
                        System.out.println("O que deseja editar?  1 - Nome | 2 - Dados Pessoais | 3 - Linguagem | 4 - Genero | 5 - Interesse | 6 - Endereço");
                    }
                    int opcao = sc.nextInt();
                    sc.nextLine();
                    switch (opcao) {
                        case 1:
                            UsuarioFree usuarioEditado = new UsuarioFree();
                            System.out.println("Digite o novo nome: ");
                            String novoNome = sc.next();
                            usuarioEditado.setNome(novoNome);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 2:
                            usuarioEditado = new UsuarioFree();
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
                            usuarioEditado = new UsuarioFree();
                            System.out.println("Digite a nova linguagem: ");
                            Linguagens novaLinguagem = Linguagens.valueOf(sc.nextLine().toUpperCase(Locale.ROOT).replace(" ", "_"));
                            usuarioEditado.setLinguagem(novaLinguagem);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 4:
                            usuarioEditado = new UsuarioFree();
                            System.out.println("Digite o novo genero: ");
                            Genero novoGenero = Genero.valueOf(sc.next().toUpperCase(Locale.ROOT));
                            usuarioEditado.setGenero(novoGenero);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 5:
                            usuarioEditado = new UsuarioFree();
                            System.out.println("Digite o novo interesse: ");
                            Interesse novoInteresse = Interesse.valueOf(sc.next().toUpperCase(Locale.ROOT));
                            usuarioEditado.setInteresse(novoInteresse);
                            opUsuario.editarUsuario(index, usuarioEditado);
                            break;
                        case 6:
                            usuarioEditado = new UsuarioFree();
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
                        case 7:
                            if(opUsuario.getUsuariosList().get(index) instanceof UsuarioPro){
                                UsuarioPro userEditado = new UsuarioPro();
                                System.out.println("Digite o novo whats: ");
                                String whatsapp = sc.next();
                                userEditado.setWhatsapp(whatsapp);
                                opUsuario.editarUsuario(index, userEditado);
                            }else {
                                System.out.println("Você não é usuario PRO");
                            }
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
                 case 5:
                     System.out.println("Escolha o indice do primeiro Match: ");;
                     opUsuario.listarTodosUsuarios();
                     int index1 = sc.nextInt();
                     while (index1 > opUsuario.getUsuariosList().size() - 1 || index1 < 0) {
                        System.out.println("Não existe essa pessoa, tente novamente: ");
                        index1 = sc.nextInt();
                    }
                     System.out.println("Escolha o indice do segundo Match: ");;
                     opUsuario.listarUsuariosDisponiveis(opUsuario.getUsuariosList().get(index1));
//                     opUsuario.listarUsuariosDisponiveis(opUsuario.getUsuariosList().);
                     int index2 = sc.nextInt();
                     while (index2 > opUsuario.getUsuariosList().size() - 1 || index2 < 0) {
                         System.out.println("Não existe essa pessoa, tente novamente: ");
                         index2 = sc.nextInt();
                     }
                     match.darMatch(opUsuario.getUsuariosList().get(index1), opUsuario.getUsuariosList().get(index2));
                     break;
                case 6:
                    System.out.println("Qual pessoa deseja ver os matches?");
                    opUsuario.listarTodosUsuarios();
                    int idUser = sc.nextInt();
                    match.imprimirMeusMatch(opUsuario.getUsuariosList().get(idUser));
                    break;

                case 7:
                    System.out.println("Quem deseja escolher: ");
                    opUsuario.listarTodosUsuarios();
                    int indexLike = sc.nextInt();
                    while (indexLike > opUsuario.getUsuariosList().size() - 1 || indexLike < 0) {
                        System.out.println("Não existe essa pessoa, tente novamente: ");
                        indexLike = sc.nextInt();
                    }
                    System.out.println("Escolha o indice do usuario que deseja dar like: ");
                    opUsuario.listarUsuariosDisponiveis(opUsuario.getUsuariosList().get(indexLike));
                    int indexLike2 = sc.nextInt();
                    while (indexLike2 > opUsuario.getUsuariosList().size() - 1 || indexLike2 < 0) {
                        System.out.println("Não existe essa pessoa, tente novamente: ");
                        indexLike2 = sc.nextInt();
                    }
                    like.darLike(opUsuario.getUsuariosList().get(indexLike), opUsuario.getUsuariosList().get(indexLike2));

                    break;
                case 8:
                    throw new MyException("Programa finalizado!");
                case 9:
                    break;
                case 10:
                    System.out.println("Informe qual usuario deseja imprimir os likes: ");
                    opUsuario.listarTodosUsuarios();
                    int indexLikes = sc.nextInt();
                    while (indexLikes > opUsuario.getUsuariosList().size() - 1 || indexLikes < 0) {
                        System.out.println("Não existe essa pessoa, tente novamente: ");
                        indexLikes = sc.nextInt();
                    }
                    like.imprimirLikes(opUsuario.getUsuariosList().get(indexLikes));
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }

        sc.close();
    }
}

