public class DemoString {
    public static void main(String[] args) {
        String s = "hello";
        String s2 = "hello";
        String s3 = s;
        String s4 = "hello!";
        String s5 = new String("hello");
        String s6 = String.valueOf("hello");
        String s7 = new String("hello");

        //inentityHashCode -> Object reference (address)
        System.out.println(System.identityHashCode(s));//925858445
        System.out.println(System.identityHashCode(s2));//925858445
        System.out.println(System.identityHashCode(s3));//925858445
        System.out.println(System.identityHashCode(s4));//798154996
        System.out.println(System.identityHashCode(s5));//681842940
        System.out.println(System.identityHashCode(s6));//925858445
        System.out.println(System.identityHashCode(s7));//1392838282

        System.out.println(s == s2);//true
        System.out.println(s.equals(s2));//true
        //if you use "==" for non-primitive, you are checking the object reference.
        //Besides, s.equals() is checking the String value itself
        System.out.println(s == s5);//false
        System.out.println(s.equals(s5));//true


        // String is immutable (propose reduce risk)
        // question: after appending "?", is "s" still the same object?
        s = s + "?";
        System.out.println(System.identityHashCode(s));//1706377736
    }
}
