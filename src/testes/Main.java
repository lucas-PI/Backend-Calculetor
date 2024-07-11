package testes;

import domain.Calculadora;
import service.ControllerOperacao;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        ControllerOperacao controller = new ControllerOperacao(calculadora);
        controller.startCalculato();
    }
}
