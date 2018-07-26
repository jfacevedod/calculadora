package com.devco.calculadora;

public class Calculadora {
    public double sumar(double sumando1, double sumando2) {
        double resultado = sumando1 + sumando2;
        return resultado;

    }

    public double restar(double sumando1, double sumando2) {
        double resultado = sumando1 - sumando2;
        return resultado;

    }

    public double dividir(double dividendo, double divisor) {
        double cociente = dividendo / divisor;
        return cociente;
    }

    public double multiplicar(int factor1, int factor2) {
        double producto = factor1 * factor2;
        return producto;
    }

}