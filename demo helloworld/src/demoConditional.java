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
  }
}
