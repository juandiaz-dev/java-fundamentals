package io.github.juandiazdev.fundamentals.controlflow;

import javax.swing.*;

public class MonthNameSwitchCaseExample {
    public static void main(String[] args) {

        String ingreseMes = JOptionPane.showInputDialog("Ingrese un mes desde el 1 al 12");

        int mesIngresado = 0;

        String resultado = "";

        try {
            mesIngresado = Integer.parseInt(ingreseMes);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: debe ingresar un numero");
            main(args);
            System.exit(0);
        }

        switch (mesIngresado){
            case 1:
                resultado = "Enero";
                break;

            case 2:
                resultado = "Febrero";
                break;

            case 3:
                resultado = "Marzo";
                break;

            case 4:
                resultado = "Abril";
                break;

            case 5:
                resultado = "Mayo";
                break;

            case 6:
                resultado = "Junio";
                break;

            case 7:
                resultado = "Julio";
                break;

            case 8:
                resultado = "Agosto";
                break;

            case 9:
                resultado = "Septiembre";
                break;

            case 10:
                resultado = "Octubre";
                break;

            case 11:
                resultado = "Noviembre";
                break;

            case 12:
                resultado = "Diciembre";
                break;

            default:
                resultado = "Mes no existente, solamente existen 12 meses";
                break;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}