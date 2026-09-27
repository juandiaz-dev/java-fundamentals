package io.github.juandiazdev.fundamentals.strings;

public class StringMethodsExample {
    public static void main(String[] args) {

        String name = "Juan";

        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());

        //Comparar a nivel de valor y no de instancia
        System.out.println("name.equals(\"Juan\") = " + name.equals("Juan"));
        System.out.println("name.equalsIgnoreCase(\"juan\") = " + name.equalsIgnoreCase("juan"));
        
        //Comparar caracteres
        System.out.println("name.compareTo(\"Juan\") = " + name.compareTo("Juan"));
        System.out.println("name.compareTo(\"Andres\") = " + name.compareTo("Andres"));
        
        //Capturar caracteres
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(3) = " + name.charAt(3));
        
        //Capturar caracteres de manera dinamica
        System.out.println("name.charAt(name.length()-4) = " + name.charAt(name.length()-4));
        
        //Obtener un fragmento del String
        System.out.println("name.substring(2) = " + name.substring(2));
        System.out.println("name.substring(1, 3) = " + name.substring(1, 3));

        //Obtener un fragmento del String de manera dinamica
        System.out.println("name.substring(name.length()-2) = " + name.substring(name.length()-2));
        
        String trabalenguas = "trabalenguas";
        
        //Cambiar un caracter por otro
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        
        //Encontrar un caracter o palabra y en que posicion se encuentra la primera ocurrencia
        //Acepta caracteres o Strings '' o " "
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        
        //Encontrar un caracter o palabra y en que posicion se encuentra la ultima ocurrencia
        //Acepta caracteres o Strings '' o ""
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf(\"lenguas\") = " + trabalenguas.lastIndexOf("lenguas"));

        //Encontrar un caracter o palabra y en que posicion se encuentra la ultima ocurrencia
        //Acepta caracteres o Strings '' o ""
        //Si existe dará = 0 porque no hay diferencias osea si existe, de lo contrario dara un = -1
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('z'));

        //Encontrar un caracter o palabra
        //Acepta solamente Strings "" no caracteres ''
        //Si existe dará = true , de lo contrario dara un = false
        System.out.println("trabalenguas.contains() = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));

        //Encontrar un caracter o palabra
        //Acepta solamente Strings "" no caracteres ''
        //Si empieza con esa letra o palabra dará = true , de lo contrario dara un = false
        System.out.println("trabalenguas.startsWith(\"lenguas\" = " + trabalenguas.startsWith("lenguas"));

        //Encontrar un caracter o palabra
        //Acepta solamente Strings "" no caracteres ''
        //Si termina con esa letra o palabra dará = true , de lo contrario dara un = false
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));

        //Quitar espacios de los lados, izquierda y derecha
        System.out.println("    trabalenguas     ");
        System.out.println("    trabalenguas     ".trim());





    }
}
