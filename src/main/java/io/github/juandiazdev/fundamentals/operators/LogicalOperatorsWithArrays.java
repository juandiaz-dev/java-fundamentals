package io.github.juandiazdev.fundamentals.operators;

import java.util.Scanner;

public class LogicalOperatorsWithArrays {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "andres";
        passwords[0] = "1234";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "123456"; */

        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"1234", "12345", "123456"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");
        String nombreUsuario = scanner.next();

        System.out.println("Ingrese la contrasena");
        String contrasena = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if ((usernames[i].equals(nombreUsuario) && passwords[i].equals(contrasena))) {
                esAutenticado = true;
                break;//nos salimos del for
            }
        } if (esAutenticado) {

            System.out.println("Bienvenido ".concat(nombreUsuario).concat("!"));
        } else{
            System.out.println("Usuario o contrasena incorrectos");
            System.out.println("Lo siento requiere autenticacion");
        }
    }
}
