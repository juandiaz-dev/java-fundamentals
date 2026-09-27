package io.github.juandiazdev.fundamentals.operators;

public class UnaryOperators {
    public static void main(String[] args) {

        //REGLA DE LOS SIGNOS
        // + * - = -
        // - * - = +
        // - * + = -
        // + * + = +

        int i = -5;

        int j = +i; // j = (1)*i => -5;
        System.out.println("j = " + j);

        int k = -i; // k = (-1)*i => 5;
        System.out.println("k = " + k);

        i = 6;
        //Positivo
        j = +i;
        System.out.println("j = " + j);

        //Negativo
        k = -i;
        System.out.println("k = " + k);
    }
}
