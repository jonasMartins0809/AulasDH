package br.ExercicioIntegrador;

public class Livro {

    //atributos
    private String autor;
    private String titulo;
    private int anoLancamento;
    private int preco;
    private int quantiEmEstoque;
    private int codIsbn;
    private int codigoLivro;
    //metodos

    public Livro(String autor, String titulo, int anoLancamento, int preco, int quantiEmEstoque, int codIsbn) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
        this.quantiEmEstoque = quantiEmEstoque;
        this.codIsbn = codIsbn;
        this.codigoLivro = codigoLivro;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getCodIsbn() {
        return codIsbn;
    }

    public int getCodigo() {
        return codigoLivro;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantiEmEstoque() {
        return quantiEmEstoque;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setQuantiEmEstoque(int quantiEmEstoque){
        this.quantiEmEstoque = quantiEmEstoque;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodIsbn(int codIsbn) {
        this.codIsbn = codIsbn;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCodigo(int codigo) {
        this.codigoLivro = codigoLivro;
    }


}
