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
        escolhaOperacao();
        System.out.println(calculadora.getTipoOperacao());
    }

    public  void escolhaOperacao(){
        calculadora.setTipoOperacao(Operacoes.selectOperacao(calculadora.getIdentificador()));

    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
