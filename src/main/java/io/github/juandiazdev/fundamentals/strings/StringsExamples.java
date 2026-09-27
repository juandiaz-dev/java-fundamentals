package io.github.juandiazdev.fundamentals.strings;

public class StringsExamples {
    public static void main(String[] args) {

        String str1 = "Java Programmer";

        String str2 = new String("Java Programmer");

        //compara referencia, el objeto
        boolean isEqual = str1 == str2;

        System.out.println("str1 == str2 = " + isEqual);

        //compara por valor, por atributo
        //Es el que se debe usar para comparar Strings
        isEqual = str1.equals(str2);
        System.out.println("str1.equals(str2) = " + isEqual);

        String str3 = "Java Programmer";

        isEqual = str1 == str3;
        System.out.println("str1 == str3 = " + isEqual);

    }
}
