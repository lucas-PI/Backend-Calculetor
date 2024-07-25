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

    }

    public  void escolhaOperacaoAndExecute(){
        calculadora.setTipoOperacao(Operacoes.selectOperacao(calculadora.getIdentificador()));
        resultado();

    }

    public void resultado(){
        calculadora.setNum1(calculadora.getTipoOperacao().operacao(calculadora.getNum1(),calculadora.getNum2()));
        System.out.println(calculadora.getNum1());
    }

    public void continueCalculo(){
        calculadora.setIdentificador(calculadora.getDesliga());
        System.out.print("num2: ");
        calculadora.setNum2(input.nextDouble());
        escolhaOperacaoAndExecute();
    }

    public void onOrOff(){
        startCalculato();
        while(true){
            calculadora.setDesliga(input.next());
            if(calculadora.getDesliga().equals("off")){
                break;
            }
            else{
              continueCalculo();
            }
        }
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
