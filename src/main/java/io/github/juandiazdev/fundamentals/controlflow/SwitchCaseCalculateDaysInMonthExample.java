package io.github.juandiazdev.fundamentals.controlflow;

import javax.swing.*;

public class SwitchCaseCalculateDaysInMonthExample {

    public static void main(String[] args) {

        String ingreseMes = JOptionPane.showInputDialog(null, "Ingresa un mes");
        int mes = 0;
        String ingreseAnio = JOptionPane.showInputDialog(null, "Ingrese un año");
        int anio = 0;

        boolean esBisiesto = (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0)));

        int numerodias = 0;

        try {
            mes = Integer.parseInt(ingreseMes);
            anio = Integer.parseInt(ingreseAnio);

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: ingrese un número válido");
            main(args);
            System.exit(0);
        }

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numerodias = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                numerodias = 30;
                break;

            case 2:
                numerodias = esBisiesto ? 29 : 28;
                break;

            default:
                numerodias = 0;
                break;
        }

        JOptionPane.showMessageDialog(null, numerodias);
    }

}
