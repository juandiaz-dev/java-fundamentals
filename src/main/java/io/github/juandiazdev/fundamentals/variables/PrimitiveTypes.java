package io.github.juandiazdev.fundamentals.variables;

public class PrimitiveTypes {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de un byte es " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte es " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numero short equivale en byte a " + Short.BYTES);
        System.out.println("numero short equivale en bites a " + Short.SIZE);
        System.out.println("valor maximo de un shrot es " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short es " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numero int equivale en byte a " + Integer.BYTES);
        System.out.println("numero int equivale en bites a " + Integer.SIZE);
        System.out.println("valor maximo de un int es " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int es " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numero long equivale en byte a " + Long.BYTES);
        System.out.println("numero long equivale en bites a " + Long.SIZE);
        System.out.println("valor maximo de un long es " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long es " + Long.MIN_VALUE);


        // Since Java 10, 'var' enables local variable type inference.
        // The compiler automatically determines the data type based on the assigned value.
        var numeroVar = 1234567890;
        System.out.println("numeroVar = " + numeroVar);
        

    }
}
