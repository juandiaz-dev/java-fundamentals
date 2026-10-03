package io.github.juandiazdev.fundamentals.operators;

public class InstanceOfOperator {
    public static void main(String[] args) {

        //instanceof solo evalua objetos
        //instanceof significa intancia de: nos permite saber si un objeto es referencia de un tipo por ejemplo una clase, una interfaz, clase abstracta
        // o incluso subtipo, saber si un objeto es descendiente o ancestro de ese tipo.

        String texto = "Creando un objeto de la clase String.... que tal!";

        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object; //texto instanceof Object; Object es la clase padre, la raiz absoluta donde todos los objetos,
        //cualquier clase y objetos heredan de Object
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es del tipo Integer = " + b1);

        b1 = num instanceof Number; //La clase Number es la clase padre de las Clases Wrapper (clases envolventes) numericas.
        //Es una clase abstracta que agrupa a todos los objetos que representan valores matemáticos (Integer, Double, Float, Short, Bye, etc).
        System.out.println("Num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("Num es del tipo Object = " + b1);




    }
}
