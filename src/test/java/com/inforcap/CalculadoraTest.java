package com.inforcap;

import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Clase Calculadora Parte 1")
public class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();
    private static Logger logger = Logger.getLogger("com.inforcap.CalculadoraTest");

    @BeforeAll
    static void setup(){
        logger.info("Inicio pruebas clase CALCULADORA");
    }

    @Test
    public void TestSumar(){
        Integer resultado = calculadora.sumar(5,7);

        Assertions.assertEquals(12,resultado);
    }

    @Test
    public void TestRestar(){
        Integer resultado = calculadora.restar(5,7);

        Assertions.assertEquals(-2,resultado);
    }

    @Test
    public void TestMultiplicar(){
        Integer resultado = calculadora.multiplicar(6,7);

        Assertions.assertEquals(42,resultado);
    }

    @Test
    public void TestDividir(){
        calculadora.dividir(4,2);
        Double resultado = calculadora.division;

        Assertions.assertEquals(2.0,resultado);

    }

    @Test
    public void TestDividirByCero(){
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(4,0);
        });

        String esperado = "No se puede dividir por 0";
        String resultado = exception.getMessage();

        Assertions.assertTrue(esperado.contains(resultado));
    }






}
