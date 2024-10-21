package metodosString;

public class StringReplace {
    public static void main (String[] args) {
        String t = "esto es un ejemplo";
        System.out.println(t);
        t=t.replace('e', '*');
        System.out.println("Ahora …  "+t);
    }
}
