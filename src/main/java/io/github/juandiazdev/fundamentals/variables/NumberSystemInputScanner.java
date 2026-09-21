package io.github.juandiazdev.fundamentals.variables;

import javax.swing.*;
import java.util.Scanner;

public class NumberSystemInputScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input an integer");

        String strNumber = scanner.nextLine();

        int numberDecimal = 0;
        try {
            numberDecimal = Integer.parseInt(strNumber);
        }catch (NumberFormatException e){
            System.out.println("Error: Please input a valid integer");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + numberDecimal);

        String decimalResult = "binary " + numberDecimal + " is : " + Integer.toBinaryString(numberDecimal);


        String octalResult = "octal number " + numberDecimal + " is " + Integer.toOctalString(numberDecimal);

        String hexaResult = "hexadecimal number " + numberDecimal + " is : " + Integer.toHexString(numberDecimal);
        System.out.println(hexaResult);

        //0x: Tells the compiler to the number as hexadecimal.
        //Uppercase or Lowercase
        int hexadecimalNumber = 0x1f4;
        System.out.println("hexadecimalNumber = " + hexadecimalNumber);

        String message = decimalResult;
        message += "\n" + octalResult;
        message += "\n" + hexaResult;

        System.out.println(message);
    }
}
