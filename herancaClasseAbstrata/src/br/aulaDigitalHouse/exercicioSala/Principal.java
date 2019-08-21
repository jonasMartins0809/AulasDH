package br.aulaDigitalHouse.exercicioSala;

public class Principal {

    public static void main(String[] args){
        Crianca bebe = new Crianca("Maria", "Masculino");

        System.out.println(bebe.getNome() +" "+ bebe.getSexo());
        bebe.estudar(false);
        bebe.respirar("Jonas");

    }
}
