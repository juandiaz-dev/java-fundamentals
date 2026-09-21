package io.github.juandiazdev.fundamentals.strings;

public class StringMethods {

    public static void main(String[] args) {

        // Simulamos un dato "sucio" recibido desde el frontend
        String emailIngresado = "   Juan.Cabezas@Uniminuto.edu   ";

// 1. .trim() -> Elimina espacios al principio y al final (Vital en backend)
        String emailLimpio = emailIngresado.trim();
        System.out.println("1. Sin espacios: '" + emailLimpio + "'");

// 2. .toLowerCase() -> Normaliza todo a minúsculas (Para guardar en base de datos)
        String emailNormalizado = emailLimpio.toLowerCase();
        System.out.println("2. Normalizado: '" + emailNormalizado + "'");

// 3. .length() -> Obtiene la cantidad de caracteres (Para validar límites)
        int longitud = emailNormalizado.length();
        System.out.println("3. Longitud válida: " + longitud + " caracteres");

// 4. Comprobamos la Inmutabilidad
        System.out.println("4. El dato original sigue intacto: '" + emailIngresado + "'");
    }
}
