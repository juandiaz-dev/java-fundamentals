package io.github.juandiazdev.fundamentals.strings;

import java.util.Locale;

public class StringValidationExample {
    public static void main(String[] args) {

        String course = null;

        boolean isNull = course == null;
        System.out.println("isNull = " + isNull);

        //Error: NullPointerException, because course variable is null
        /*System.out.println(course.toUpperCase());*/

        //Se salta el error y no se ejecuta este bloque de codigo porque la variable isNull es true y no false
       /* if (isNull == false){
            System.out.println(course.toUpperCase());
        } */

        // Error: NullPointerException
        /*System.out.println("Bienvenidos al curso " .concat(course));*/

        //Bienvenidos al curso null
       /* System.out.println("Bienvenidos al curso " + course); */

        if (isNull)/*(isNull = true)*/{
            course = "";//"Java Programmer";
        }

        //validar tamaño de un String
        boolean isEmpty = course.length() == 0;
        System.out.println("isEmpty = " + isEmpty);

        boolean isEmpty2 = course.isEmpty();
        System.out.println("isEmpty2 = " + isEmpty2);

        //La forma mas segura y estricta de validar un String es con isBlank
        boolean isWhite = course.isBlank();
        System.out.println("isWhite = " + isWhite);

        //No se ejecuta porque la variable course esta vacia
        if (!isWhite)/*(isEmpty == false)*/ {
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to course = " .concat(course));
        }
    }
}
