package io.github.juandiazdev.fundamentals.operators;

public class LogicalOperators {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        //Con el operador logico AND && ambos deben ser verdaderos para que se cumpla la expresion
        //Si una de las expresiones es falsa automaticamente da false y no evalua las siguientes expresiones
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        //Con el operador OR || evalua si una de las expresiones es verdadera, si una sola es verdadera y las demas falsas
        //no importa, para de buscar cuando es true
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);

        boolean b4 = i == j && (k > l || m == false);
        System.out.println("b4 = " + b4);

        //PRECEDENCIA OPERADORES LOGICOS
        //El operador AND && siempre va a tener prioridad antes que el OR ||
        boolean b5 = i == j || k < l && m == true;
        System.out.println("b5 = " + b5);

        boolean b6 = (i == j || k < l) && m == true;
        System.out.println("b6 = " + b6);

        boolean b7 = true || true && false;
        System.out.println("b7 = " + b7);

        boolean b8 = (true || true) && false;
        System.out.println("b8 = " + b8);

        boolean b9 = true || false && false || false;
        System.out.println("b9 = " + b9); //true

        boolean b10 = ((true || false) && false) || false;
        System.out.println("b10 = " + b10);

    }
}
