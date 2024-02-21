import java.util.Scanner;

public class TestDeCurso1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite tu nombre para la factura");
        String nombreFactura = scanner.nextLine();

        System.out.println("digita un valor del primer producto");
        double primerValor = scanner.nextDouble();

        System.out.println("digita un valor del segundo producto");
        double segundoValor = scanner.nextDouble();
        
        double total = primerValor+segundoValor;
        double impuesto = total * .19;
        double totMasImpuestos = total + impuesto;


        System.out.println("Señor "+nombreFactura+"\n"+"Total de su compra es: "+total
        +"\n"+"Su impuesto es:"+impuesto+"\n"+"Total con impuestos es: "+totMasImpuestos);

        

        



    }
}
