public class exercise20241210 {
  public static void main (String[] args){
    //exercise 20241212
    double pricef0rapple = 7.3;
    double pricef0rorange = 6.5;
    int quantity0fapple = 3;
    int quantity0forange = 4;
    double x = pricef0rapple * quantity0fapple;
    double y = pricef0rorange * quantity0forange;
    double totalamount = x + y;
    System.out.println(totalamount);

    int engScore = 73;
    int mathScore = 60;
    int histScore = 61;
    int totalScore = engScore + mathScore + histScore;
    double averScore = totalScore / 3;
    System.out.println(averScore);

    byte bMax = 127;
    short sMax = 32767;
    int iMax = 2_100_000_000;
    long lmax = 2^63-1;
    byte bMin = -128;
    short sMin = -32768;
    int iMin = -2_100_000_000;
    long lMin = -2^63;

    //bMax = bMax + 1;//(not safe for java)
    bMax = (byte) (bMax + 1);//(not safe for java)(force to do)
    System.out.println(bMax);

    int output = bMin + 100;//(safe for java)
    System.out.println(output);

    //1.compile time & 2.run time
    //1.1.java.file(.java)->class file(.class):java code->byte code(close to machine code)
    //1.1.1.compile fail. for example(missing: syntax error)
    //1.1.2.compile success -> class file
    //1.2 java virtual machine(JVM):class file -> machine code 
  }
}