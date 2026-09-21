package io.github.juandiazdev.fundamentals.variables;

import javax.swing.*;

public class NumberSystemsAndDialogInput {
    public static void main(String[] args) {

        String strNumber = JOptionPane.showInputDialog(null, "input an integer");

        int numberDecimal = 0;
        try {
            numberDecimal = Integer.parseInt(strNumber);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Please input a valid integer");
            System.exit(0);
        }

        System.out.println("decimalNumber = " + numberDecimal);

        String decimalResult = "binary " + numberDecimal + " is : " + Integer.toBinaryString(numberDecimal);

        System.out.println(decimalResult);

        //0b: Tells the compiler to interpret the number as binary.
        int numberBinary = 0b111110100;
        System.out.println("numberBinary = " + numberBinary);

        String octalResult = "octal number " + numberDecimal + " is " + Integer.toOctalString(numberDecimal);

        System.out.println(octalResult);

        //0: Tells the compiler to interpret the number as octal.
        int octalNumber = 0764;
        System.out.println("octalNumber = " + octalNumber);

        String hexaResult = "hexadecimal number " + numberDecimal + " is : " + Integer.toHexString(numberDecimal);
        System.out.println(hexaResult);

        //0x: Tells the compiler to the number as hexadecimal.
        //Uppercase or Lowercase
        int hexadecimalNumber = 0x1f4;
        System.out.println("hexadecimalNumber = " + hexadecimalNumber);

        String message = decimalResult;
        message += "\n" + octalResult;
        message += "\n" + hexaResult;

        JOptionPane.showMessageDialog(null, message);

    }
}
