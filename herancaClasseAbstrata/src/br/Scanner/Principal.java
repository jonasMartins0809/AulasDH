package br.Scanner;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner pegandoNome = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String  nome = pegandoNome.next();

        System.out.println("Olá "+nome);
    }

}
