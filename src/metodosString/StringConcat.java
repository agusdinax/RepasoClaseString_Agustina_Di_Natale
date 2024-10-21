package metodosString;

public class StringConcat {
    public static void main (String[] args) {
        String t1="Esto en un ejemplo";
        String t2="HOLI";
        String t3=null;
        System.out.println("\""+t1+"\" unido con \""+t2+"\", resulta:");
        t3=t1.concat(t2);
        System.out.print(t3);
    }
}
