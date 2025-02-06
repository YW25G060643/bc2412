public class DemoStringBuilder {
    public static void main(String[] args) {
        String s = "Hello";
        s += "???";
        s += "!!!";

        long before = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 100_000; i++) {
            s += "!";
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);

        StringBuilder sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            sb.append("!");
        }
        System.out.println(sb.length());
        after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
