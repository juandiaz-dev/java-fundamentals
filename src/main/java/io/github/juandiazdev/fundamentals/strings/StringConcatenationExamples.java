package io.github.juandiazdev.fundamentals.strings;

public class StringConcatenationExamples {
    public static void main(String[] args) {

        String course = "Java Programmer";

        String teacher = "Andrés Guzman";

        String details = course + " With teacher " + teacher;
        System.out.println(details);

        int numberA = 10;

        int numberB = 5;

        //(operator precedence)
        System.out.println(details + (numberA + numberB));

        System.out.println(numberA + numberB + details);


       // String details2 = course.concat(" with ".concat(teacher));
        String details2 = course.concat(" with ").concat(teacher);

        System.out.println("details2 = " + details2);

    }
}
