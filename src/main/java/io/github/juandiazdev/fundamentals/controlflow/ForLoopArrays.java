package io.github.juandiazdev.fundamentals.controlflow;

import javax.swing.*;

public class ForLoopArrays {
    public static void main(String[] args) {

        //String[] nombres = new String[6];
        //se puede dejar el corchete en el tipo de dato o en el nombre de la variable String nombres[] = {};
        //por buena practica es mejor dejarlo en el tipo de dato.
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int contador = nombres.length;

        for (int i = 0; i < contador; i++){
            System.out.println(i + " " + nombres[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < contador; i++){
            if (nombres[i].equalsIgnoreCase("Andres") ||
                    nombres[i].equalsIgnoreCase("Pepa")){
                continue;
            }
            System.out.println(i + " " + nombres[i]); // Se salta esos dos nombres, no los imprime en consola.
        }

        System.out.println("\n");

        //Otra manera con el Contains, pero como el metodo Contains no tiene un IgnoreCase se puede realizar
        //lo siguiente para evitar problemas en las mayusculas y/o minusculas en la comparación de los nombres.
        for (int i = 0; i < contador; i++){
            if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("PePa".toLowerCase())){
                continue;
            }
            System.out.println(i + " " + nombres[i]); // Se salta esos dos nombres, no los imprime en consola.
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, por ejemplo \"Pepe\" o \"Maria\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres[i] = " + nombres[i]);//Ver los nombres que imprime hasta encontrarlo.
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema!");
        }

    }
}
