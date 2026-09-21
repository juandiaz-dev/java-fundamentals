package io.github.juandiazdev.fundamentals.strings;

public class StringCreation {
    public static void main(String[] args) {

        String course = "Java Backend";
        String course2 = new String("Java Backend");

// Comparación primitiva usando '=='
        boolean isSameReference = course == course2;
        System.out.println("course == course2 : " + isSameReference);

// Comparación orientada a objetos usando '.equals()'
        boolean isSameValue = course.equals(course2);
        System.out.println("course.equals(course2) : " + isSameValue);

        String course3 = "Java Backend";
// Como ambos son literales, Java recicla la memoria del String Pool
        boolean isSamePoolReference = course == course3;
        System.out.println("course == course3 : " + isSamePoolReference);
    }
}
