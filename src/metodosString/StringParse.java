package metodosString;

public class StringParse {
    public static void main (String[] args) {
        // Ejemplo con byte
        String byteStr = "100";
        byte datoByte = Byte.parseByte(byteStr);
        System.out.println("Byte.parseByte: " + datoByte);

        // Ejemplo con short
        String shortStr = "32000";
        short datoShort = Short.parseShort(shortStr);
        System.out.println("Short.parseShort: " + datoShort);

        // Ejemplo con int
        String intStr = "123456";
        int datoInt = Integer.parseInt(intStr);
        System.out.println("Integer.parseInt: " + datoInt);

        // Ejemplo con long
        String longStr = "123456789";
        long datoLong = Long.parseLong(longStr);
        System.out.println("Long.parseLong: " + datoLong);

        // Ejemplo con float
        String floatStr = "3.14";
        float datoFloat = Float.parseFloat(floatStr);
        System.out.println("Float.parseFloat: " + datoFloat);

        // Ejemplo con double
        String doubleStr = "123.456";
        double datoDouble = Double.parseDouble(doubleStr);
        System.out.println("Double.parseDouble: " + datoDouble);

        // Ejemplo con boolean
        String booleanStr = "true";
        boolean datoBoolean = Boolean.parseBoolean(booleanStr);
        System.out.println("Boolean.parseBoolean: " + datoBoolean);
    }
}
