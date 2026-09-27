package io.github.juandiazdev.fundamentals.operators;

import javax.swing.*;

public class ArithmeticOperators {
    public static void main(String[] args) {

        //Se puede dejar en una misma linea si es el mismo tipo de dato
        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        //Se evalua de izquierda a derecha
        //Un String no se puede sumar con un número, pero si se puede concatenar
        //Los parentesis son prioridad
        System.out.println("i + j = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);

        System.out.println("(i - j) = " + (i - j));

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int division = i / j;
        float division2 = (float) i /j; // pueden ser los 2 pero con uno es suficiente (float) i / (float) j;
        System.out.println("division = " + division);
        System.out.println("division2 = " + division2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }

    }
}
