package metodosString;

public class StringCompareToIgnoreCase {
    public static void main (String[] args) {
        String te1= "Hola";
        String te2= "hola";
        if(te1.compareToIgnoreCase(te2) == 0)
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");
    }
}
