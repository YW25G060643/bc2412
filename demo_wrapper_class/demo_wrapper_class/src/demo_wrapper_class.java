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

        char c = 'd';
        Character c2 = c;
        boolean b = true;
        Boolean b2 = b;
        byte by = 2;
        Byte by2 = by;
        short s = 21;
        Short s2 = s;
        long l = 222222222;
        Long l2 = l;
        float f2 = 3.333333f;
        Float f3 = f2;
    }
}
