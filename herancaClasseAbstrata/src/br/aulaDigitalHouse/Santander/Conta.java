package br.aulaDigitalHouse.Santander;

public class Conta {
    private String saldo;
    private String numCliente;
    private Cliente titular;

    public Conta(String novoSaldo,  Cliente novoTitular){
        saldo = novoSaldo;
        titular = novoTitular;
    }


    }
