package metodosString;

public class StringValueOf {
    public static void main (String[] args) {
        // Ejemplo con boolean
        boolean valorBoolean = true;
        String booleanStr = String.valueOf(valorBoolean);
        System.out.println("String.valueOf(boolean): " + booleanStr);

        // Ejemplo con int
        int valorInt = 123;
        String intStr = String.valueOf(valorInt);
        System.out.println("String.valueOf(int): " + intStr);

        // Ejemplo con long
        long valorLong = 123456789L;
        String longStr = String.valueOf(valorLong);
        System.out.println("String.valueOf(long): " + longStr);

        // Ejemplo con float
        float valorFloat = 3.14f;
        String floatStr = String.valueOf(valorFloat);
        System.out.println("String.valueOf(float): " + floatStr);

        // Ejemplo con Object
        Object valorObject = new Object();
        String objectStr = String.valueOf(valorObject);
        System.out.println("String.valueOf(Object): " + objectStr);

        // Ejemplo con char
        char valorChar = 'A';
        String charStr = String.valueOf(valorChar);
        System.out.println("String.valueOf(char): " + charStr);

        // Ejemplo con double
        double valorDouble = 123.456;
        String doubleStr = String.valueOf(valorDouble);
        System.out.println("String.valueOf(double): " + doubleStr);
    }
}
