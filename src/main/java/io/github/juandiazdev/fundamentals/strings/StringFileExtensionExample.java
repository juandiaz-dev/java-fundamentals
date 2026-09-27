package io.github.juandiazdev.fundamentals.strings;

public class StringFileExtensionExample {
    public static void main(String[] args) {

        String file = "Alguna.imagen.jpg";

        int i = file.lastIndexOf('.');

        System.out.println("file.length() = " + file.length());
        System.out.println("file.substring(i+1) = " + file.substring(i+1));

        //De esta manera se obtiene de forma dinamica el nombre de la extension del archivo.
    }
}
