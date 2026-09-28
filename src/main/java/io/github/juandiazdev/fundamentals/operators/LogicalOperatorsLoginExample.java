package io.github.juandiazdev.fundamentals.operators;

import java.util.Scanner;

public class LogicalOperatorsLoginExample {
    public static void main(String[] args) {

        String username = "andres";
        String password = "1234";

        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");
        String nombreUsuario = scanner.next();

        System.out.println("Ingrese la contraseña");
        String contraseña = scanner.next();

        boolean esAutenticado = false;

        if ((username.equals(nombreUsuario) && password.equals(contraseña)) ||
            (username2.equals(nombreUsuario) && password2.equals(contraseña))){
            esAutenticado = true;
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }

        if (esAutenticado){
            System.out.println("Bienvenido ".concat(nombreUsuario).concat("!"));
        } else {
            System.out.println("Lo siento requiere autenticacion");
        }

    }
}
