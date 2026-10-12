package io.github.juandiazdev.fundamentals.controlflow;

import javax.swing.*;

public class CalculateDaysInMonth {

    public static void main(String[] args) {

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
