package com.isutc;

public class Cliente {

    private String nome;
    private int idade;
    private String morada;
    private int numero_ID;


    public Cliente(String nome, int idade, String morada, int numero_ID) {
        this.nome = nome;
        this.idade = idade;
        this.morada = morada;
        this.numero_ID = numero_ID;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNumero_ID() {
        return numero_ID;
    }

    public void setNumero_ID(int numero_ID) {
        this.numero_ID = numero_ID;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", morada='" + morada + '\'' +
                ", numero_ID='" + numero_ID + '\'' +
                '}';
    }
}
