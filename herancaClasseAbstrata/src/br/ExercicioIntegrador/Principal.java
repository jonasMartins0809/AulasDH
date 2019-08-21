package br.ExercicioIntegrador;

public class Principal {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Livro livroA = new Livro("Peido", "A volta dos que nao foram", 2019,39,10, 123123);

        sistema.cadastrarLivro(livroA);
        sistema.venda(livroA);


    }
}
