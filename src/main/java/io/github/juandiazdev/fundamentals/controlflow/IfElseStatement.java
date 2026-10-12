package io.github.juandiazdev.fundamentals.controlflow;

public class IfElseStatement {
    public static void main(String[] args) {

        double promedio = 5.5;

        //las llaves {} se pueden omitir siempre y cuando el bloque de código a ejecutar en el if y el else sea una sola linea de código
        //pero como buena practica es recomendable siempre agregar las llaves {}
        if (promedio >= 6.5) {
            System.out.println("Felicidades, excelente promedio");
        } else if (promedio >= 6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, debes esforzarte un poco mas");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficient, debes estudiar mas");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println("Tu promedio es " + promedio);


    }
}
