package br.com.minhaempresa.service;

import br.com.minhaempresa.domain.Operacao;

public class CalculadoraService {

    public double calcular(double operandoA, double operandoB, Operacao operacao) {

        double resultado=0;

        switch(operacao) {
            case SOMA: {
                resultado = this.somar(operandoA, operandoB);
                break;
            }
            case SUBTRACAO: {
                resultado = this.subtrair(operandoA, operandoB);
                break;
            }
            case MULTIPLICACAO: {
                resultado = this.multiplicar(operandoA, operandoB);
                break;
            }
            case DIVISAO: {
                resultado = this.dividir(operandoA, operandoB);
                break;
            }
        }
        return resultado;
    }

    private double somar(double operandoA, double operandoB) {
        return (operandoA + operandoB);
    }

    private double subtrair(double operandoA, double operandoB) {
        return (operandoA - operandoB);
    }

    private double multiplicar(double operandoA, double operandoB) {
        return (operandoA * operandoB);
    }

    private double dividir(double operandoA, double operandoB) {
        if(operandoB==0) {
            throw new ArithmeticException("O operando B deve ser diferente de zero!");
        }
        return (operandoA / operandoB);
    }
}
