public class exercise20241212 {
  public static void main(String[] args){
    /**
 * Expected Output:
 * 
 * a > 9
 * str length < 27
 */
// Primitive types and operators
    int a = 3;
    if (a == 9) {
      System.out.println("a is equals to 9");
    } else if (a >= 0 && a <= 8) {
      System.out.println("a is between 0 and 8");
    } else if (a > 9) {
      System.out.println("a > 9");
    } else {
      System.out.println("a < 0");
    }

    String str = "I love Java. I love coding";
    int length = 27;
    if (length == str.length()) {
      System.out.println("str length=27");
    } else if (length < str.length()) { // code here ... add the condition
      System.out.println("str length < 27");
    } else if (length > str.length()) { // code here ... complete the code
      System.out.println("str length > 27");
    }
  }
}