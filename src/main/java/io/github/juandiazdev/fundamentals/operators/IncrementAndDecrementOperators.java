package io.github.juandiazdev.fundamentals.operators;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {

        //Pre incremento
        //Primero se incrementa la variable i y luego se asigna a la variable j, por lo cual ambos valen 2
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post incremento
        //Primero se asigna el valor de la variable i a la variable j y luego se incrementa la variable i
        //y quedaria i = 3 y j = 2
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i = 3;
        j = --i; // j = i - 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);

        
    }
}
