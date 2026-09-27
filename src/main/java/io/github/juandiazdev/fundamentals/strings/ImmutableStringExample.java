package io.github.juandiazdev.fundamentals.strings;

public class ImmutableStringExample {
    public static void main(String[] args) {

        String course = "Programmer Java";

        String teacher = "Andrés Guzmán";

        String result = course.concat(teacher);
        System.out.println("course = " + course);
        System.out.println("result = " + result);
        System.out.println(course == result);

        //Lambda expresion
       String result2 = course.transform(c -> {
            return c + " with " + teacher;
        });

        System.out.println("course = " + course);

        System.out.println("result2 = " + result2);

        String result3 = result.replace("a", "A");
        System.out.println("result3 = " + result3);
    }
}
