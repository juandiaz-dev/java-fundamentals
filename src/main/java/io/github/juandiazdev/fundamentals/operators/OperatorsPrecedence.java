package io.github.juandiazdev.fundamentals.operators;

public class OperatorsPrecedence {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        //La division tiene prioridad antes que una suma, si la division ya se indica que es un decimal (3d), el resto de la
        //operacion tambien será decimal en este caso de tipo doble, por lo cual se da prioridad a la suma con los parentesis()
        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        //la division, la multiplicación y el resto % tienen la misma prioridad
        //Siempre inicia de izquierda a derecha, en este caso empieza con la division, si estuviera primero la multiplicación
        //y luego la division entonces primero multiplicaría y luego dividiría.
        promedio = i + j + k / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) * 3d / 10;
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / (3d * 10);
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / (3d * 10);
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k /3d * 10; //15 + 8 (++i + j--) + 66.6 (k /3d * 10);
        System.out.println("promedio = " + promedio);

        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}
