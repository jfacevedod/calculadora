package com.devco.calculadora;


import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculadoraAgregadoTest {

    CalculadoraAgregado calculadoraAgregado = new CalculadoraAgregado();

    @Test
    public void dadoQueIngreso1234ElResultadoDebeSer4(){
        //Arrange
        double dato1 = 1;
        double dato2 = 2;
        double dato3 = 3;
        double dato4 = 4;

        // Mock
        Calculadora calculadora = Mockito.mock(Calculadora.class);
        Mockito.when(calculadora.sumar(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(3.0);
        Mockito.when(calculadora.restar(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(-1.0);

        // Spy
        calculadoraAgregado = Mockito.spy(calculadoraAgregado);
        Mockito.doReturn(calculadora).when(calculadoraAgregado).calculadoraBuilder();
        Mockito.doReturn(2.0).when(calculadoraAgregado).cosa(Mockito.anyInt());

        //Act
        double respuesta = calculadoraAgregado.agregarSumasRestas(dato1, dato2, dato3, dato4);

        //Assert
        assertThat(respuesta, is(4.0));
    }

    @Test
    public void dadoQueIngresoElResultadoDebeSer41(){
        //Arrange
        double dato1 = 1;
        double dato2 = 1;
        double dato3 = 1;
        double dato4 = 1;

        // Mock
        Calculadora calculadora = Mockito.mock(Calculadora.class);
        Mockito.when(calculadora.sumar(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(60.0);
        Mockito.when(calculadora.restar(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(19.0);

        // Spy
        calculadoraAgregado = Mockito.spy(calculadoraAgregado);
        Mockito.doReturn(calculadora).when(calculadoraAgregado).calculadoraBuilder();
        Mockito.doReturn(2.0).when(calculadoraAgregado).cosa(Mockito.anyInt());

        //Act
        double respuesta = calculadoraAgregado.agregarSumasRestas(dato1, dato2, dato3, dato4);

        //Assert
        assertThat(respuesta, is(41.0));
    }


}