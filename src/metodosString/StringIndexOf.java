package metodosString;

public class StringIndexOf {
    public static void main (String[] args) {
        String t = "Esto es un ejemplo";
        System.out.print("Primera posicion del caracter \"e\" en \""+t);
        System.out.println("\" es:" +t.indexOf('e'));

        //indexOf(char ch, int start)
        String t2 = "Esto es un ejemplo";
        System.out.print("Primera posición del carácter \"e\" en \""+t2);
        System.out.println("\"\n comenzando a buscar desde la 6 es: ");
        System.out.println(t.indexOf('e', 6));

        //indexOf(char ch, int start)
        String t3 = "Mi mami me mima a mi";
        System.out.println("Primera posición del texto \"mi\" en \""+t3);
        System.out.print("\"comenzando la búsqueda de posición 0 ");   	System.out.println("es:" +t3.indexOf("mi"));

        //indexOf(char ch, int start)
        String t4 = "Esto es un ejemplo de ejemplo";
        int posicion = t.indexOf("ejemplo", 10);
        System.out.println("Primera posición de la subcadena \"ejemplo\" comenzando desde la posición 10 es: " + posicion);
    }
}
