public class demoConditional {
  public static void main(String [] args){
    //if -> check event ->event result
    int x = 3;
    if (x > 2){
      System.out.println("x is > 2");
    }

    String s = "hello";
    //check if length > 3
    if (s.length() > 3){
      System.out.println("s is > 3");
    }else{
      System.out.println("s is < 3");
    }

    if (s.equals("hello")){
      System.out.println("s = hello");
    }
    char firstChar = s.charAt(s.length() - s.length());
    if ('h' == firstChar) {
      System.out.println("s`s first number = h");
    }

    if (x > 5){
      System.out.println("x > 5");
    }else{
      System.out.println("x <= 5");
    }

    int y = 10;
    //check if y is an even number
    if (y % 2 == 0){
      System.out.println("y is an even number");
    }else{
      System.out.println("y is an odd number");
    }

    //check if y > 3 and an even number
    if (y > 3){
      System.out.println("y > 3");
    }
    if (y % 2 == 0) {
      System.out.println("y is an even number");
    }
  }
}
