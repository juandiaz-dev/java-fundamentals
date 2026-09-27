package io.github.juandiazdev.fundamentals.strings;

import java.util.Scanner;

public class NameManagementProgram {
    public static void main(String[] args) {

        Scanner names = new Scanner(System.in);

        //Primer nombre
        System.out.println("Ingrese el primero nombre");

        String name1 = names.nextLine();

        String transformedName1 = name1.substring(1,2).toUpperCase() + "." + name1.substring(name1.length()-2);


        //Segundo nombre
        System.out.println("Ingrese el segundo nombre");

        String name2 = names.nextLine();

        String transformedName2 = name2.substring(1,2).toUpperCase() + "." + name2.substring(name2.length()-2);


        //Tercer nombre
        System.out.println("Ingrese el tercer nombre");

        String name3 = names.nextLine();;

        String transformedName3 = name3.substring(1,2).toUpperCase() + "." + name3.substring(name3.length()-2);

        //Resultado
        String resultado = transformedName1;
        resultado += "_" + transformedName2;
        resultado += "_" + transformedName3;

        System.out.println("resultado = " + resultado);
    }
}
