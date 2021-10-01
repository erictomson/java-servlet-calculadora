package br.com.minhaempresa.service;

public class CalculadoraService {

    public double calcular(double operandoA, double operandoB, int operacao) {

        double resultado=0;

        switch (operacao) {
            case 0 -> resultado = somar(operandoA,operandoB);
            case 1 -> resultado = subtrair(operandoA,operandoB);
            case 2 -> resultado = multiplicar(operandoA,operandoB);
            case 3 -> resultado = dividir(operandoA,operandoB);
            default -> {}
        }

        return resultado;
    }

    private double somar(double operandoA, double operandoB) {
        return operandoA + operandoB;
    }

    private double subtrair(double operandoA, double operandoB) {
        return operandoA - operandoB;
    }

    private double multiplicar(double operandoA, double operandoB) {
        return operandoA * operandoB;
    }

    private double dividir(double operandoA, double operandoB) {
        return operandoA / operandoB;
    }
}
