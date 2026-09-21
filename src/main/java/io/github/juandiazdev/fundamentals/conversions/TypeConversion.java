package io.github.juandiazdev.fundamentals.conversions;

public class TypeConversion {
    public static void main(String[] args) {

        //var numberSrt = "50";
        String numberStr = "50";

        //var integernumb = Integer.parseInt(numberSrt);
        int integerNumber = Integer.parseInt(numberStr);
        System.out.println("integernumb = " + integerNumber);

        //var realStr = "9876543e-3"; //"98765.43";
        String realStr = "9876543e-3"; //"98765.43";

        //var realDouble = Double.parseDouble(realStr);
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //var logicoStr = "true";
        String logicoStr = "true";

        //var logicoBoolean = Boolean.parseBoolean(logicoStr);
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // 2. De Primitivo a String
        int anInteger = 100;
        String anIntegerStr = String.valueOf(anInteger);
        System.out.println("anIntegerStr = " + anIntegerStr);

// 3. Casting Forzado (Pérdida de datos)
        int maxNumber = 32768; // Supera el límite de un short por 1
        short forcedShort = (short) maxNumber;
        System.out.println("forcedShort = " + forcedShort); // Imprimirá un número negativo por el desbordamiento

    }
}
