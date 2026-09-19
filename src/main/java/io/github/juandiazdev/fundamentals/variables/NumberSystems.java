package io.github.juandiazdev.fundamentals.variables;

public class NumberSystems {
    public static void main(String[] args) {

        int numberDecimal = 500;
        System.out.println("numberDecimal = " + numberDecimal);

        System.out.println("binary " + numberDecimal + " is : " + Integer.toBinaryString(numberDecimal));

        //0b: Tells the compiler to interpret the number as binary.
        int numberBinary = 0b111110100;
        System.out.println("numberBinary = " + numberBinary);

        System.out.println("octal number " + numberDecimal + " is " + Integer.toOctalString(numberDecimal));

        //0: Tells the compiler to interpret the number as octal.
        int octalNumber = 0764;
        System.out.println("octalNumber = " + octalNumber);

        System.out.println("hexadecimal number " + numberDecimal + " is : " + Integer.toHexString(numberDecimal));

        //0x: Tells the compiler to the numer as hexadecimal.
        //Uppercase or Lowercase
        int hexadecimalNumber = 0x1f4;
        System.out.println("hexadecimalNumber = " + hexadecimalNumber);
    }
}
