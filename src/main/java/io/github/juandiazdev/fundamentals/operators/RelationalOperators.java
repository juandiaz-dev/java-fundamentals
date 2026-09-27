package io.github.juandiazdev.fundamentals.operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        //Operador de relacion == se utiliza tipicamente en primitivos
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        //Operador ! sirve para invertir el valor booleano
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        //Operador distinto !=
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        boolean b4 = m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = m != true;
        System.out.println("b5 = " + b5);

        //Operador mayor que >
        boolean b6 = i > j;
        System.out.println("b6 = " + b6);

        //Operador menor que <
        boolean b7 = i < j;
        System.out.println("b7 = " + b7);

        //Operador mayor o igual que >=
        boolean b8 = l >= k;
        System.out.println("b8 = " + b8);

        //Operador menor o igual que <=
        boolean b9 = l <= k;
        System.out.println("b9 = " + b9);
    }
}
