public class EjemploStringRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0 ; i < 100000; i ++){
            // c = c.concat(a).concat(b).concat("\n");//500 => 2 ms,1000 => 7ms,10000 => 95ms, 100000 => 5558ms
            // c += a + b + "\n";// 500 => 19ms , 1000 => 15ms, 10000 => 76ms, 100000 => 2021ms
            sb.append(a).append(b).append("\n");// 500 => 1ms, 1000 => 1ms, 10000 => 2ms, 100000 => 9ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
