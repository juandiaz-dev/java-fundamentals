package io.github.juandiazdev.fundamentals.operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        //Siempre devuelve un valor, true o false, en cambio del if que ejecuta un bloque de codigo

        // variable = condicion ? si es verdadero : si es falso;
        //Funciona para cualquier tipo de dato no solo con String, para un tipo primitivo, entero, booleano, etc.
        //Incluso puede ser un objeto, una instancia de cualquier tipo de objeto
        String variable = 7==5 ? "Si, es verdadero" : "No, es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double ingles = 0.0;



        Scanner notas = new Scanner(System.in);

        System.out.println(" Por favor indica las notas de matematicas ");
        matematicas = notas.nextDouble();

        System.out.println(" Por favor indica las notas de ciencias ");
        ciencias = notas.nextDouble();

        System.out.println(" Por favor indica las notas de ingles ");
        ingles = notas.nextDouble();


        promedio = (matematicas + ciencias + ingles) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);

       /* if (promedio >= 5.49) {
            estado = " Aprobado ";
        } else {
            estado = " Rechazado ";
        }*/
    }
}
