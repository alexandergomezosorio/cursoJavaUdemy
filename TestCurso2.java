public class TestCurso2 {
    public static void main(String[] args) {
        String hija = "Salome";
        String mujer = "Adriana";
        String yo = "Alexander";
        

        String hijaLetra = hija.substring(1,2).toUpperCase().concat(".");
        String hijaUltimas2 = hija.substring(hija.length()-2);
        String mujerLetra = mujer.substring(1,2).toUpperCase().concat(".");
        String mujerUltimas2 = mujer.substring(mujer.length()-2);
        String yoLetra = yo.substring(1,2).toUpperCase().concat(".");
        String yoUltimas2 = yo.substring(yo.length()-2);

        System.out.println(hijaLetra+hijaUltimas2+"_"+mujerLetra+mujerUltimas2+"_"+yoLetra+yoUltimas2);


    }
}
