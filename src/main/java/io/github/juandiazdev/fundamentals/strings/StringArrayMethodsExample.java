package io.github.juandiazdev.fundamentals.strings;

public class StringArrayMethodsExample {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println(" trabalenguas.toCharArray() = " +  trabalenguas.toCharArray());

        //length en un String es un metodo
        //length en un arreglo es un atributo, una propiedad

        char[] array = trabalenguas.toCharArray();
        int largo = array.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++){
            System.out.println("array = " + array[i]);
        }

        //convierte el String en un arreglo, donde las palabras y/o caracteres estan separadas por la letra a
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] array2 = trabalenguas.split("a");
        int largo2 = array2.length;
        for (int j = 0; j < largo2; j++){
            System.out.println("array2 = " + array2[j]);
        }

        String file = "alguna.imagen.jpg";
        //file.split("\\."); al escaparlo con el "\\." da a entender que es el caracter punto . y no un palabra
        //clave o reservada de expresiones regulares respecto al caracter punto
        String[] fileArray = file.split ("[.]");//("\\.");

        largo2 = fileArray.length;
        System.out.println("largo2 = " + largo2);

        for (int j = 0; j < largo2; j++){
            System.out.println("fileArray = " + fileArray[j]);
        }
        System.out.println("Extension = " + fileArray[largo2-1]);
    }
}
