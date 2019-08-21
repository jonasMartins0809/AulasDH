package br.Exercicios.Excecoes;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){
        try{

            ArrayList<String> novaLista = new ArrayList<>();
        }

        novaLista.add("Pato");
        novaLista.add("Cachorro");
        novaLista.add("Gato");

        System.out.println(novaLista.get(3));
        }catch{

    }
    }

