package io.github.juandiazdev.fundamentals.operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        //Operador de asignacion =
        int i = 5;
        int j = i + 4;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Compuesto para suma +=
        i += 2; // i = i + 2;
        System.out.println("i = " + i);

        i += 5; // i = i +5;
        System.out.println("i = " + i);


        //Compuesto para resta
        j -= 4; // j = j - 4;
        System.out.println("j = " + j);


        //Compuesto para multiplicacion
        j *= 3;
        System.out.println("j = " + j);

        //Y asi sucesivamente: /=, %=

        //Tambien se puede realizar concatenacion compuesta con Strings
        //Este ejemplo es de una base de datos Sql
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre = 'Andres' ";
        sqlString += " and c.activo = 1";

        System.out.println("sqlString = " + sqlString);


    }
}
