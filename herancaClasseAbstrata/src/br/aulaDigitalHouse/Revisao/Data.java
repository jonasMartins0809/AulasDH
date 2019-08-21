package br.aulaDigitalHouse.Revisao;

public class Data {
    //atributos
    private int dia;
    private int mes;
    private int ano;

    public Data(int novoDia, int novoMes, int novoAno){
        dia = novoDia;
        mes = novoMes;
        ano = novoAno;
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int novoAno) {
        ano = novoAno;
            }

    public void setMes(int novoMes) {
        mes = novoMes;
    }

    public void setDia(int novoDia) {
        dia = novoDia;
    }
}
