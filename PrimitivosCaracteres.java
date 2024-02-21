public class PrimitivosCaracteres {
    public static void main(String[] args) {

        var carater = '\u0040';
        var decimal = 64;
        System.out.println("carater = " + carater);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == carater));

        char simbolo = '@';
        System.out.println("simbolo = caracter: " + (simbolo == carater));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';

        System.out.println("Char corresponde en byte a:"+tabulador+ Character.BYTES);
        System.out.println("char corresponde en bites a:"+espacio+Character.SIZE);
        System.out.println("máximo valor para char:"+espacio+Character.MAX_VALUE);
        System.out.println("mínimo valor para char:"+espacio+Character.MIN_VALUE);
    }
}
