package io.github.juandiazdev.fundamentals.operators;

public class InstanceOfAbstractTypes {
    public static void main(String[] args) {

        //instanceof solo evalua objetos
        //instanceof significa intancia de: nos permite saber si un objeto es referencia de un tipo por ejemplo una clase, una interfaz, clase abstracta
        // o incluso subtipo, saber si un objeto es descendiente o ancestro de ese tipo.

        Object texto = "Creando un objeto de la clase String.... que tal!";
        // Integer num = Integer.valueOf(7); La manera correcta es Integer.valueOf(); y no con el new
        Number num = 7; //Integer.valueOf(7); puede ser primitivo o String Integer.valueOf("7"); al colocarlo de manera literal :7;
        //Java crea por debajo el Integer.valueOf(7);

        boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String = " + b1);

        //Al crear directamente la clase con la clase padre me permite hacer la validación y no da error de compilación
        //a pesar que el tipo texto es un String y Integer es tipo numerico, aunque dará false nos permite validar.
        b1 = texto instanceof Integer; //texto instanceof Object; Object es la clase padre, la raiz absoluta donde todos los objetos,
        //cualquier clase y objetos heredan de Object
        System.out.println("Texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es del tipo Integer = " + b1);

        b1 = num instanceof Number; //La clase Number es la clase padre de las Clases Wrapper (clases envolventes) numericas.
        //Es una clase abstracta que agrupa a todos los objetos que representan valores matemáticos (Integer, Double, Float, Short, Bye, etc).
        System.out.println("Num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("Num es del tipo Object = " + b1);

        //false, un Integer no es instancia de Long, pero nos permite realizar la validación.
        b1 = num instanceof Long;
        System.out.println("Num es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("Num es del tipo Double = " + b1);

        Number decimal = 45.54;

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);

    }
}
