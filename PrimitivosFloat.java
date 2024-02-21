public class PrimitivosFloat {
    public static void main(String[] args) {

        //float realFloat = 2.12E3F; //2120F;
        //float realFloat = 1.5E4F; //15000F;
        float realFloat =0.00000000015F; //1.5E-10F;
                System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a "+ Float.BYTES);
        System.out.println("float corresponde en bites a "+ Float.SIZE);
        System.out.println("máximo valor para float: "+ Float.MAX_VALUE);
        System.out.println("mínimo valor para float: "+ Float.MIN_VALUE);

        double numeroDouble = 3.4028235E38;

        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("double corresponde en byte a "+ Double.BYTES);
        System.out.println("double corresponde en bites a "+ Double.SIZE);
        System.out.println("Máximo valor para double: "+ Double.MAX_VALUE);
        System.out.println("Mínimo valor para double: "+ Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
