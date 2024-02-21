public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Alexander";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Alex\") = " + nombre.equals("Alex"));
        System.out.println("nombre.equals(\"alex\") = " + nombre.equals("alex"));
        System.out.println("nombre.equalsIgnoreCase(\"alex\") = " + nombre.equalsIgnoreCase("alex"));
        System.out.println("nombre = " + nombre.compareTo("Alex"));
        System.out.println("nombre = " + nombre.compareTo("Adriana"));
        System.out.println("nombre = " + nombre.charAt(0));
        System.out.println("nombre = " + nombre.charAt(2));
        System.out.println("nombre = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre = " + nombre.substring(1,5));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        String trabalengua = "trabalenguas";

        System.out.println("trabalengua.replace(\"a\",\".\") = " + trabalengua.replace("a","."));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf("lenguas"));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("lenguas"));
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));
        System.out.println("trabalengua.endsWith(\"lenguas\") = " + trabalengua.endsWith("lenguas"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());
        
        
        
        

    }
}
