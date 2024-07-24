package service;

import domain.Calculadora;
import domain.Operacoes;

import java.util.Scanner;

public class ControllerOperacao {
    Scanner input = new Scanner(System.in);

    private Calculadora calculadora;

    public ControllerOperacao(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public void startCalculato(){
        System.out.print("num1: ");
        calculadora.setNum1(input.nextDouble());
        calculadora.setIdentificador(input.next());
        System.out.print("num2: ");
        calculadora.setNum2(input.nextDouble());
        escolhaOperacaoAndExecute();
        System.out.println(calculadora.getRes());
    }

    public  void escolhaOperacaoAndExecute(){
        calculadora.setTipoOperacao(Operacoes.selectOperacao(calculadora.getIdentificador()));
        calculadora.setRes(calculadora.getTipoOperacao().operacao(calculadora.getNum1(),calculadora.getNum2()));

    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
