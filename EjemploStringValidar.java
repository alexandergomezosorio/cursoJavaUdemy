import java.sql.SQLOutput;
import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        
        boolean esNull = curso == null;

        System.out.println("esNull = " + esNull);

        if(esNull){
            curso = "Programacion Java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false){
            System.out.println(curso.toUpperCase(Locale.ROOT));
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
