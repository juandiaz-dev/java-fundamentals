package io.github.juandiazdev.fundamentals.controlflow;

public class ForLoop {
    public static void main(String[] args) {

        //for va con paréntesis como todo flujo de control, tambien se pueden omitir las llaves {} si es una sola linea
        //de codigo, pero por buena práctica es mejor agregarla siempre.

        //Tambien se pueden dejar inicializadas las variables fuera del for, el incremento o decremento se pueden dejar
        //por fuera de los parentesis() al final de la iteración (pero siempre dentro de las llaves dentro del for {})
        //de igual manera la condicion se puede dejar fuera de los parentesis() y se puede colocar dentro de un if abajo del for
        //pero de igual manera dentro de las llaves del for{}, lo unico que se puede dejar inicialidado por fuera del bloque for
        //son las variables pero por buenas practicas no es recomendable hacerlo, y siempre dejar todo inicializado desde el for.

        //EL BUCLE FOR SE UTILIZA MUCHO PARA ITERAR SOBRE ARREGLOS

        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + " - " + j);
        }

        //No imprime los numeros pares se los salta, con la negacion si lo haria: if (!(i % 2 == 0));
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0){
                continue; // Se sale de la iteración del if, pero continua con el bucle for hasta terminar la condición
            }
            System.out.println("i = " + i);
        }
    }
}
