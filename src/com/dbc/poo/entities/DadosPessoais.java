package com.dbc.poo.entities;

public class DadosPessoais {

    private Integer idade;
    private String email;

    public DadosPessoais() {
    }

    public DadosPessoais(Integer idade, String email) {
        this.idade = idade;
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

        public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void imprimirDados(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "DadosPessoais{" +
                "idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
