package br.aulaDigitalHouse.Santander;

public class Cliente {
    private int numCliente;
    private String rg;
    private String cpf;
    private String sobrenome;
    private String sexo;


    public Cliente(String novoSobrenome, String novoRg){
        sobrenome = novoSobrenome;
        rg = novoRg;
    }
}
