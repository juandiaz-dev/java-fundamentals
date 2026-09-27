package io.github.juandiazdev.fundamentals.strings;

public class StringConcatenationPerformanceTest {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 -> 3ms, 1000 -> 6ms, 10000 -> 161ms, 100000 -> 8359ms
            // c += a + b + "\n"; //500 -> 28ms, 1000 -> 30ms, 10000 -> 102ms, 100000 -> 3130ms
             sb.append(a).append(b).append("\n"); // 500 -> 0ms, 1000 -> 0ms, 10000 -> 2ms, 100000 -> 19ms
            /*sb.append(a);
            sb.append(b);
            sb.append("\n");*/

        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
