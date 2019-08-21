package br.ExercicioIntegrador;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private Livro livro;

    ArrayList<Livro> listaDeLivro = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {

        listaDeLivro.add(livro);
    }

    public void consultarLivro(Livro livro) {
        if (listaDeLivro.contains(livro)) {
            System.out.println("o livro " + livro + "foi encontrado na biblioteca");
        } else {
            System.out.println("o livro não foi encontrado");
        };

        }
     public void venda(Livro livro){
        if (livro.getQuantiEmEstoque() > 0){
            livro.setQuantiEmEstoque(livro.getQuantiEmEstoque()-1);
            System.out.println("temos no estoque o livro " + livro.getQuantiEmEstoque());
        }else{
            System.out.println("Não temos estoque");
        }
    }
}



