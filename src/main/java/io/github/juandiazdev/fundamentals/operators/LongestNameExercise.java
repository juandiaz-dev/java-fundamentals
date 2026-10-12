package io.github.juandiazdev.fundamentals.operators;

import javax.swing.*;

public class LongestNameExercise {
    public static void main(String[] args) {

       String nombre1 = JOptionPane.showInputDialog(null, "Ingrese el primer nombre completo");
       String persona1 = nombre1.split(" ")[0];
       int largoNombre1 = persona1.length();


        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el segundo nombre completo");
        String persona2 = nombre2.split(" ")[0];
        int largoNombre2 = persona2.length();


        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese el tercer nombre completo");
        String persona3 = nombre3.split(" ")[0];
        int largoNombre3 = persona3.length();

        String primeraFase = (largoNombre1 > largoNombre2) ? nombre1 : nombre2;

        int largoGanadorFase1 = (largoNombre1 > largoNombre2) ? largoNombre1 : largoNombre2;

        String ganadorFinal = (largoGanadorFase1 > largoNombre3) ? primeraFase : nombre3;

        JOptionPane.showMessageDialog(null, ganadorFinal + " tiene el nombre más largo.");


    }
}
