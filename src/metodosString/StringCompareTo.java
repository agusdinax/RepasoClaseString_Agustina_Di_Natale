package metodosString;

public class StringCompareTo {
    public static void main (String[] args) {
        String a="gato", b="perro", c="GATO";
        int z=a.compareTo(b);
        int p=b.compareTo(a);
        int q=a.compareToIgnoreCase(c);
    }
}
