package io.github.juandiazdev.fundamentals.variables;

public class FloatingPrimitives {
    public static void main(String[] args) {

        // Real or decimal numbers.
        // If you add a decimal point, such as 1.0, Java treats it as a 'double' by default.
        // To specify a 'float', append 'f' or 'F' (e.g., 1.0f).
        // Scientific notation is also supported using 'e' or 'E'.
        float realFloat = 2120F; //2.12e3f;
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 1.5e4f; //1500F;
        System.out.println("realFloat2 = " + realFloat2);

        //A floating-point number with many digits may be displayed in scientific notation to represent its value more compactly.
        float realFloatNegative = 1.5e-10f; //0.00000000015f;
        System.out.println("realFloatNegative = " + realFloatNegative);
        System.out.println("float bytes : " + Float.BYTES);
        System.out.println("float bites : " + Float.SIZE);
        System.out.println("max value float : " + Float.MAX_VALUE);
        System.out.println("min value float :  " + Float.MIN_VALUE);


    }
}
