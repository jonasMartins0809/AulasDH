package br.aulaDigitalHouse.Revisao;

public class Gerente extends Funcionario{
     //atributo
    private String area;
    //metodo
    public Gerente(String novoNome, Data nooNascimento, float novoSalario){
        super(novoNome, novoSalario, novoNascimento);
    }

    public void calculaImposto(){
        float calImposto = (float) (salario * 0.03);
        return calImposto;
    }

    @Override
    public float calculaImposto() {
        return super.calculaImposto();
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
    }


}
