public class DemoInteger {
    public static void main(String[] args) {
        Integer x = 3;
        Integer x2 = 3;

        //2 reference i object
        System.out.println(System.identityHashCode(x));//925858445
        System.out.println(System.identityHashCode(x2));//925858445

        Integer x3 = new Integer(3);
        System.out.println(System.identityHashCode(x3));//798154996
        Integer x4 = Integer.valueOf(3);
        System.out.println(System.identityHashCode(x4));//925858445

        //cache range: -128 ~ 127
        Integer x5 = 128;
        Integer x6 = 128;
        System.out.println(System.identityHashCode(x5));//681842940
        System.out.println(System.identityHashCode(x6));//1392838282
        Integer x7 = new Integer(128);
        Integer x8 = Integer.valueOf(128);
        System.out.println(System.identityHashCode(x5));//681842940
        System.out.println(System.identityHashCode(x6));//1392838282

        //same situation for byte, short, long, Charactor
        Character c1 = 'a';
        Character c2 = 'a';
        System.err.println(System.identityHashCode(c1));//523429237
        System.err.println(System.identityHashCode(c2));//523429237

        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(System.identityHashCode(b1));//664740647
        System.out.println(System.identityHashCode(b2));//664740647

        Double d1 = 10.3;
        Double d2 = 10.3;
        System.out.println(System.identityHashCode(d1));//804564176
        System.out.println(System.identityHashCode(d2));//1421795058
        
        Float f1 = 10.3f;
        Float f2 = 10.3f;
        System.out.println(System.identityHashCode(f1));//1555009629
        System.out.println(System.identityHashCode(f2));//41359092

        //<.>.<=.>=.!=.==.for primitive only
        Double d3 = 10.3;
        Double d4 = 10.1;
        if (d3.compareTo(d4) > 0) {
            System.out.println("d3 > d4");
        }
        if (d3.compareTo(d4) > 0) {
            System.out.println("d3 < d4");
        }
        if (d3.equals(d4)) {
            System.out.println("d3 = d4");
        }

        if (d3 > 3.0) {
          
        }
    }
}