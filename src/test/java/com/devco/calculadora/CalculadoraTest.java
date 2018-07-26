package com.devco.calculadora;

import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void sumar1Mas1DebeDar2(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        double sumando1 = 1;
        double sumando2 = 1;

        //Act
        double resultado = calculadora.sumar(sumando1, sumando2);

        //Assert
        assertThat(resultado, is(2.0));
    }

    @Test
    public void sumar1Mas3DebeDar4(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        double sumando1 = 1;
        double sumando2 = 3;

        //Act
        double resultado = calculadora.sumar(sumando1, sumando2);

        //Assert
        assertThat(resultado, is(4.0));
    }

    @Test
    public void sumar1Con3Mas3DebeDar4Con3(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        double sumando1 = 1.3;
        double sumando2 = 3;

        //Act
        double resultado = calculadora.sumar(sumando1, sumando2);

        //Assert
        assertThat(resultado, is(4.3));
    }

    @Test
    public void dividir4Entre2DebeDar2(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int dividendo = 4;
        int divisor = 2;

        //Act
        double cociente = calculadora.dividir(dividendo, divisor );

        //Assert

        assertThat(cociente, is(2.0));

    }

    @Test
    public void dividir3Entre2DebeDar1Con5(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int dividendo = 3;
        int divisor = 2;

        //Act
        double cociente = calculadora.dividir(dividendo, divisor);

        //Assert
        assertThat(cociente, is(1.5));

    }

    @Test
    public void multiplicar3Entre4DebeDar12(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int factor1 = 3;
        int factor2 = 4;

        //Act
        double producto = calculadora.multiplicar(factor1, factor2);

        //Assert
        assertThat(producto, is (12.0));


    }

}