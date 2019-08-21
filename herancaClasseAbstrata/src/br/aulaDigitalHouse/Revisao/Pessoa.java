package br.aulaDigitalHouse.Revisao;

public abstract class Pessoa {
    //atributos
    private String nome;
    private Data nascimento;

    public Pessoa(String novoNome, Data novoNascimento){
        nome = novoNome;
        nascimento = novoNascimento;
    }

    //Metodos
    public abstract void imprimeDados();

    public String getNome() {
        return nome;
    }

    public Data getNascimento() {
        return nascimento;
    }



}
