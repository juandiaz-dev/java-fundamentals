package io.github.juandiazdev.fundamentals.controlflow;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        int num = 2; // SwitchCase puede recibir int, shor, char, byte, String y las clases wraper INTEGER, SHORT, STRING, etc.

        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            //Se recomienda usar brek; para que termine la acción cuando encuentre el caso y no siga ejecuntando el resto de código.
            case 1:
                System.out.println("El numero es uno");
                break;

            case 2:
                System.out.println("El numero es dos");
                break;

            case 3:
                System.out.println("El numero es tres");
                break;

                //default: es como el else del if, si no caza con ningun caso, se ejecuta el default.
            default:
                System.out.println("Numero o caracter desconocido");

        }

        String nombre = "pepe";

        switch (nombre){
            case "admin":
                System.out.println("Bienvenido admin");
                break;

            case "andres" :
                System.out.println("Bienvenido andres");
                break;

            case "pepe" :
                System.out.println("Bienvenido pepe");
                break;

            default:
                System.out.println("Usuario desconocido");
        }
    }
}
