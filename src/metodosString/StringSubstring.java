package metodosString;

public class StringSubstring {
    public static void main (String[] args) {
        String fra,fr="Es tan corto el amor y tan largo el olvido";
        int z =fr.indexOf(" ");
        fra=fr.substring(0,z);
        System.out.println("es: \""+ fra+"\"");

        //substring( int, int )
        String subcadena1 = fra.substring(5, 7);
        System.out.println("La subcadena desde el índice 5 hasta el 7 es: \"" + subcadena1 + "\"");
    }
}
