package io.github.juandiazdev.fundamentals.variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSystemInputScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input an integer");

       // String strNumber = scanner.nextLine();

        int numberDecimal = 0;
        try {
            numberDecimal = scanner.nextInt(); //Integer.parseInt(strNumber);
        }catch (InputMismatchException e){
            System.out.println("Error: Please input a valid integer");
            scanner.nextLine();
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + numberDecimal);

        String decimalResult = "binary " + numberDecimal + " is : " + Integer.toBinaryString(numberDecimal);


        String octalResult = "octal number " + numberDecimal + " is " + Integer.toOctalString(numberDecimal);

        String hexaResult = "hexadecimal number " + numberDecimal + " is : " + Integer.toHexString(numberDecimal);

        String message = decimalResult;
        message += "\n" + octalResult;
        message += "\n" + hexaResult;

        System.out.println(message);
    }
}
