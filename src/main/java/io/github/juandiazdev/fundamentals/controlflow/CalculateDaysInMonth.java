package io.github.juandiazdev.fundamentals.controlflow;

import javax.swing.*;

public class CalculateDaysInMonth {

    public static void main(String[] args) {

        /*
        Un detalle de lógica pura (Para pensar como Arquitecto de Software):Técnicamente, tu código funciona perfecto
        para lo que pide el ejercicio. Sin embargo, hay un pequeño "bug lógico" muy sutil.Observa lo que pasa
        si el usuario ingresa el mes 1 (Enero) y el año 2024. El programa entra al primer bloque (líneas 28-30),
        asigna 31 días y automáticamente dice que mensajeFinal = "no es bisiesto". ¡Pero el 2024 sí es bisiesto!
        El problema ocurre porque encerraste la fórmula matemática del año bisiesto exclusivamente dentro del bloque de febrero (mes == 2).
        Para los demás meses, el programa ni siquiera revisa en qué año estamos y asume por defecto que no es bisiesto.
        ¿Cómo se resuelve esto en el mundo real?Generalmente, calculamos el año bisiesto de forma independiente antes
        de evaluar los meses. Guardamos ese resultado en una variable de tipo boolean (ejemplo: boolean esBisiesto = true;).
        Así, la fórmula matemática hace su trabajo primero, y el resto del programa simplemente revisa esa variable.
         */

        String mensajeFinal = "";

        String ingreseMes = JOptionPane.showInputDialog(null, "Ingresa un mes");
        int mes = 0;
        String ingreseAnio = JOptionPane.showInputDialog(null, "Ingrese un año");
        int anio = 0;

        int numerodias = 0;

        try {
            mes = Integer.parseInt(ingreseMes);
            anio = Integer.parseInt(ingreseAnio);

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: ingrese un número válido");
            main(args);
            System.exit(0);
        }

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
            numerodias = 31;
            mensajeFinal = "no es bisiesto";
        } else if( mes == 4 || mes == 6 || mes == 9 || mes == 11){
            numerodias = 30;
            mensajeFinal = "no es bisiesto";
        } else if(mes == 2){
            if( anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numerodias = 29;
                mensajeFinal = "si es bisiesto";
            }else {
                numerodias = 28;
                mensajeFinal = "no es bisiesto";
            }
        }
        JOptionPane.showMessageDialog(null,"El mes tiene en dias " + numerodias + " por lo cual " + mensajeFinal);
    }

}
