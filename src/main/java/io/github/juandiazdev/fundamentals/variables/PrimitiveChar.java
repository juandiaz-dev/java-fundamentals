package io.github.juandiazdev.fundamentals.variables;

public class PrimitiveChar {
    public static void main(String[] args) {

        //The `char` type stores a single character, such as a letter, digit, or Unicode character.
        //Although `'5'` looks like a number, for `char` it is a character, not the numeric value `5`.
        char letter = 'A';
        char digit = '5';
        char symbol = '€';
        char unicode = '\u0040';
        //A `char` can be converted to its corresponding decimal value.
        char decimal = 64;

        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
        System.out.println("symbol = " + symbol);
        System.out.println("unicode = " + unicode);
        System.out.println("decimal = " + decimal);

        System.out.println("char bytes : " + Character.BYTES);
        System.out.println("char bits : " + Character.SIZE);
        System.out.println("max value char : " + Character.MAX_VALUE);
        System.out.println("min value char : " + Character.MIN_VALUE);

        //Special characters
        char space = ' '; // char Space = '\u0020';
        System.out.println("testing space character" + space + "There should be a space between the words.");

        char backSpace = '\b';
        System.out.println("testing back space character" + backSpace + "The `e` should be removed.");

        char tab = '\t';
        //It can be included implicitly within the string.
        System.out.println("testing tabulation \tcharacter" + tab + "There should be a tab.");

        char newLine = '\n';
        System.out.println("testing line break character" + newLine + "There should be a line break.");

        char carriageReturn = '\r';
        // '\r' (Carriage Return) moves the cursor to the beginning of the line.
        // Note: IDE consoles might hide the remaining characters, but a real OS terminal would print "Hola56789".
        System.out.println("123456789" + carriageReturn + "Hola");
    }
}
