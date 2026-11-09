package io.github.juandiazdev.fundamentals.controlflow;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 0;

        //El while y do while salen del loop al momento que se cambia el estado de true a false o viceverza.

        while (i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba) {

            if (i == 7) //Con esta condicion matamos la iteración cuando i sea igual a 7 y se sale del loop
            {
                prueba = false;
            }
            System.out.println("i = " + i);

            i++;
        }

        prueba = false;

        while (prueba){
            System.out.println("Este codigo nunca se ejecuta");// el while es pre prueba, quiere decir que primero evalua,
            //despues ejecuta y luego ietera, en este ejemplo este codigo no se ejecuta porque prueba es false y el while esta en true
        }

        do {
            System.out.println("Este codigo se ejecuta al menos una sola vez");// el do while es post prueba, es decir,
            //primero ejecuta un fragmento de codigo y luego evalua para volver a iterar.
        } while (prueba);

        prueba = true;
        i = 0;

        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);

    }
}
