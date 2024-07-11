package domain;

public class Calculadora {
    private double num1, num2;
    private double res;
    private Operacoes tipoOperacao;
    private String identificador;


    public Calculadora(){

    }


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public Operacoes getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(Operacoes tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
}
