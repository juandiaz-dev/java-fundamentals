package io.github.juandiazdev.fundamentals.operators;

import javax.swing.*;

public class GasTankSystemExercise {
    public static void main(String[] args) {

        String medidaGasolina = JOptionPane.showInputDialog(null, "Ingrese la medida actual de la gasolina en litros");

        double medidaEnLitros = 0;

        try {
            medidaEnLitros = Double.parseDouble(medidaGasolina);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese un numero");
            main(args);
            System.exit(0);
        }

        if (medidaEnLitros == 70) {
            JOptionPane.showMessageDialog(null, "Estanque lleno");
        } else if (medidaEnLitros >= 60 && medidaEnLitros < 70) {
            JOptionPane.showMessageDialog(null, "Estanque casi lleno");
        } else if (medidaEnLitros >= 40 && medidaEnLitros < 60) {
            JOptionPane.showMessageDialog(null, "Estanque 3/4");
        } else if (medidaEnLitros >= 35 && medidaEnLitros < 40) {
            JOptionPane.showMessageDialog(null, "Medio Estanque");
        } else if (medidaEnLitros >= 20 && medidaEnLitros < 35) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        } else if (medidaEnLitros >=1 && medidaEnLitros < 20) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }


    }
}
