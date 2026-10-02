package io.github.juandiazdev.fundamentals.operators;

import java.util.Scanner;

public class RelationalOperatorsLoginExample {

    public static void main(String[] args) {

        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"1234", "12345", "123456"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");
        String nombreUsuario = scanner.next();

        System.out.println("Ingrese la contrasena");
        String contrasena = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = ((usernames[i].equals(nombreUsuario) && passwords[i].equals(contrasena))) ? true: esAutenticado;

            /*if ((usernames[i].equals(nombreUsuario) && passwords[i].equals(contrasena))) {
                esAutenticado = true;
                break;//nos salimos del for // se puede omitir el break solamente en cantidades pequeñas, en cantidades grandes
                //tipo 100 o mas datos se usa el if y el break para que pare de buscar una vez encuentre las coincidencias
                //y asi optimizamos recursos
            } */
        }

        String mensaje = esAutenticado ? "Bienvenido ".concat(nombreUsuario).concat("! ") : "Usuario o contrasena incorrectos\nLo siento requiere autenticacion";

        System.out.println("mensaje = " + mensaje);

        /*if (esAutenticado) {
             System.out.println("Bienvenido ".concat(nombreUsuario).concat("!"));
        } else{
            System.out.println("Usuario o contrasena incorrectos");
            System.out.println("Lo siento requiere autenticacion");
        }*/

    }
}
