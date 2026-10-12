package io.github.juandiazdev.fundamentals.operators;

import javax.swing.*;

public class DisplayTwoNumbersInOrderExercise {
    public static void main(String[] args) {

        String numero1 = JOptionPane.showInputDialog("Ingresa el primer numero");
        int primero = 0;

        String numero2 = JOptionPane.showInputDialog("Ingresa el segundo numero");
        int segundo = 0;

        try {
            primero =Integer.parseInt(numero1);
            segundo =Integer.parseInt(numero2);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: por favor ingrese un numero valido");
            main(args);
            System.exit(0);
        }

        String ordenados = (primero > segundo) ? primero + ", " + segundo : segundo + ", " + primero;

        JOptionPane.showMessageDialog(null, "El orden es el siguiente: " + ordenados);

    }
}
