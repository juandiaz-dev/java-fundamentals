package io.github.juandiazdev.fundamentals.conversions;

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

// 1. Creamos un único "micrófono" para escuchar toda la entrada
        Scanner scanner = new Scanner(System.in);

// 2. Pedimos y GUARDAMOS el nombre en una variable String
        System.out.println("Ingrese el nombre de la factura:");
        String nombreFactura = scanner.nextLine();

// 3. Pedimos y GUARDAMOS los valores numéricos
        System.out.println("Ingrese el primer valor:");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo valor:");
        double precio2 = scanner.nextDouble();

// 4. Ahora sí sumas las variables numéricas, no la herramienta Scanner
        double valorTotalBruto = precio1 + precio2;

// 5. Calculamos el impuesto del 19% (multiplicando por 0.19)
        double impuesto = valorTotalBruto * 0.19;

// 6. Calculamos el monto final incluyendo el impuesto
        double valorNeto = valorTotalBruto + impuesto;

        String totalFactura = "La factura " + nombreFactura +
                              " tiene un total bruto de " + valorTotalBruto +
                              " con un impuesto de " + impuesto +
                              " y el monto despues de impuestos es de: " + valorNeto;

        System.out.println("totalFactura = " + totalFactura);

    }
}
