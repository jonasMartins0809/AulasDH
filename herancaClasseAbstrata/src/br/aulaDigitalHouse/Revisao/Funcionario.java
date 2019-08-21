package br.aulaDigitalHouse.Revisao;

public class Funcionario extends Pessoa {
    //atributo
    private float salario;
    //metodo
    public Funcionario(String novoNome, Data novoNascimento){
        super(novoNome, novoNascimento);
    }

    @Override
    public void imprimeDados() {
        float salarioCalImposto = calculaImposto();
        System.out.println("o valor final do calculo é de: "+salarioCalImposto);
    }

    public float calculaImposto(){
        float calImposto = (float) (salario * 0.03);
        return calImposto;
    }



}
