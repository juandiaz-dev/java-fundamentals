package io.github.juandiazdev.fundamentals.controlflow;

public class ForEachLoop {
    public static void main(String[] args) {

        //El foreach solamente se utiliza para iterar sobre arreglos u objetos de coleccion de Java que son tipos de
        //iterable

        int[] numeros = {1,3,5,7,9,11,13,15};

        for (int num : numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        for (String names : nombres){
            System.out.println("names = " + names);
        }
    }
}
