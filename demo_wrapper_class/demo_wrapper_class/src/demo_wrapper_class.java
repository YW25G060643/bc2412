public class demo_wrapper_class {
    public static void main(String[] args){
        int x = 3;//x is a primitive type variable
        Integer x2 = x;//auto-box
        System.out.println(x2);//3
        System.out.println(x2.doubleValue());//3.0
        System.out.println(x2.longValue());//3
        System.out.println(x2);//3

        System.out.println("hellooo".length());//7 string = object

        double d = 3.3;
        Double d2 = d;//auto-box
        System.out.println(d2);//3.3
        System.out.println(d2.intValue());//3
        float f = d2.floatValue();
        System.out.println(f);
        //method == presentation

        double d3 = d2.doubleValue();//un-box
        System.out.println(d3);

        char c = 'd';
        Character c2 = c;
        System.out.println(c2.compareTo(c));//0
        Character c3 = 'c';
        System.out.println(c3.compareTo(c));//-1
        Character c4 = 'E';
        System.out.println(c4.compareTo(c));//-31

        int ascii0fA = 'A';
        int ascii0fa = 'a';
        System.out.println(ascii0fa - ascii0fA);//32
        System.out.println('a' - 'A');//32 char - char ->int - int

        boolean b = true;
        Boolean b2 = b;
        System.out.println(b2);
        boolean b3 = b2;
        System.out.println(b3);

        byte by = 2;
        Byte by2 = by;
        System.out.println(by2);

        short s = 21;
        Short s2 = s;
        System.out.println(s2);

        long l = 222222222;
        Long l2 = l;
        System.out.println(l2);

        float f2 = 3.333333f;
        Float f3 = f2;
        System.out.println(f3);
    }
}