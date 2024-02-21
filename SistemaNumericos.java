import javax.swing.*;

public class SistemaNumericos {
    public static void main(String[]args){

        int numeroDecimal = 0;
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        try{
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numero decimal = "+numeroDecimal);

        String resultadoBinario = "numero binario de "+ numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numero binario = "+numeroBinario);

        String resultadoOctal = "numero octal de = "+ numeroDecimal +" = "+ Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("numero octal "+numeroOctal);

        String resultadoHexadecimal = "numero hexadecimal de"+numeroDecimal +" = "+ Integer.toHexString(numeroDecimal);
        System.out.println("numero hexadecimal de"+numeroDecimal +" = "+ Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println("numero = "+ numeroHex);

        String mensaje = resultadoBinario;
        mensaje+= "\n"+resultadoOctal;
        mensaje += "\n"+ resultadoHexadecimal;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
