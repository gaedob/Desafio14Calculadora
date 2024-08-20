package com.inforcap;

public class Calculadora {

    public Double division;

    public Integer sumar(Integer a, Integer b){
        return a+b;
    }

    public Integer restar(Integer a, Integer b){
        return a-b;
    }

    public Integer multiplicar(Integer a, Integer b){
        return a*b;
    }

    public void dividir(Integer a, Integer b){
        if (b != 0) {
            this.division =  a / (double) b;
            return;
        }
        throw new ArithmeticException("No se puede dividir por 0");
    }





}
