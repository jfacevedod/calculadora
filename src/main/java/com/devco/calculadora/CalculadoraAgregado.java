package com.devco.calculadora;

public class CalculadoraAgregado {

    public Calculadora calculadoraBuilder(){
        Calculadora calculadora = new Calculadora();
        return calculadora;
    }

    public double agregarSumasRestas(double dato1, double dato2,double dato3,double dato4){
        Calculadora calculadora = calculadoraBuilder();
        double res1 = calculadora.sumar(dato1, dato2);
        double res2 = calculadora.restar(dato3, dato4);
        double cosa1 = cosa(2);
        double res3 = res1 - res2;
        return res3;
    }

    public double cosa (int a){
        return 2;
    }
}