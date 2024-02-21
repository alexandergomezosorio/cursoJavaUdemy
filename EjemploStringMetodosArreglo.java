public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.length() = " + trabalengua.length());
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray());

        char[] arreglo = trabalengua.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        
        for(int i = 0; i < largo; i++){
            System.out.print(arreglo[i]);
        }

        System.out.println("\ntrabalengua = " + trabalengua.split("a"));

        String[] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;

        for(int j = 0; j < l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.js";
        String[] archivoArr = archivo.split("[.]");// \\. o [.]
        l = archivoArr.length;
        System.out.println("l = " + l);
        for(int j = 0; j < l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extencion = "+ archivoArr[l-1]);
    }
}
