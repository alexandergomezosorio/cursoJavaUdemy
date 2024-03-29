public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numero int = "+numeroInt);

        String realStr = "9876.43";
        double realDoble = Double.parseDouble(realStr);
        System.out.println("real double = "+realDoble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("Logico boolean = "+logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("Otro numero int = "+otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("Otro numero string = "+otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = "+ otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println(otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println(otroRealStr);

        int i = 32768;
        short s = (short) i;
        System.out.println("s = "+ s);
        long l = i;
        System.out.println("Long = "+l);
        System.out.println(Short.MAX_VALUE);
        
        char b = (char)i;
        System.out.println("b = " + b);
        
        float f = i;
        System.out.println("f = " + f);
    }
}
