package io.github.juandiazdev.fundamentals.variables;

public class BooleanPrimitive {
    public static void main(String[] args) {

        //direct form
        boolean logicData = true;
        System.out.println("logicDate = " + logicData);

        //Using the `boolean` constant, it returns a `boolean` object.
        boolean logicData2 = Boolean.TRUE;
        System.out.println("logicDate2 = " + logicData2);

        boolean logicData3 = (3-2 == 1); // 3-2==1;
        System.out.println("logicDate3 = " + logicData3);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);

        float f = 1.2345e2F; // 123.45
        System.out.println("f = " + f);

        logicData = d > f;
        System.out.println("logicDate = " + logicData);

    }
}
