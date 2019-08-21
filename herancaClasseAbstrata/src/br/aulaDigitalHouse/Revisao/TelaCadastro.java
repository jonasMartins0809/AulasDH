package br.aulaDigitalHouse.Revisao;

public class TelaCadastro {

    public static void main(String[] args){

        Data novaData = new Data(10, 8, 2019);
        Cliente novoCliente = new Cliente("João", novaData, 234);
        novoCliente.imprimeDados();
    }
}
