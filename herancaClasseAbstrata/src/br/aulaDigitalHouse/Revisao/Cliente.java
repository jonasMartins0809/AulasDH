package br.aulaDigitalHouse.Revisao;

public class Cliente extends Pessoa {
  //atributos
    private int codigo;
//metodos
  public Cliente(String novoNome, Data novoNscimento, int novoCodigo){
      super(novoNome, novoNscimento);
      codigo = novoCodigo;
      System.out.println("oi meu nome é: "+super.getNome());
  }
    @Override
    public void imprimeDados() {
        System.out.println(super.getNome()+ "\n"
        +super.getNascimento().getDia()
        +super.getNascimento().getMes()
        +super.getNascimento().getAno()
                +"\n"
        +codigo);
    }
     //get
    public int getCodigo(){
      return codigo;
    }
    //set
    public void setCodigo(int novoCodigo){
      codigo = novoCodigo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                '}';
    }
}
