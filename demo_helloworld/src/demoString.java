public class demoString {
  public static void main(String[] args) {
    char x = 'a';
    x = 1;
    //x = 1.1;
    //x = true;
    x = 'x';
    //char x = '0';
    
    //define a string value by double quote
    //define a char value by single quote
    //char y = 'abcd1234';
    String password = "abcd1234";
    String emailAddress = "123@456.com";
    
    //+ operation
    emailAddress = emailAddress + "!";
    System.out.println("hello world");
    System.out.println(emailAddress);

    //java method
    //action/ tools
    //index starts from 0 to length-1
    System.out.println(password.charAt(3));
    char result = password.charAt(7);
    System.out.println(result);
    System.out.println(emailAddress.charAt(10));

    //equals()
    String s1 = "abc";
    String s2 = "abc";
    boolean result2 = s1.equals(s2);
    System.out.println(result2);
    boolean result3 = password.equals(x);
    System.out.println(result3);

    //length()
    int result4 = password.length();
    System.out.println(result4);

    //print the last char of string
    char lastChar = password.charAt(password.length() - 1);
    System.out.println(lastChar);

    //empty string
    String emptyString = "";
    System.out.println(emptyString.length());//0
    boolean isStringEmpty = "".equals(emptyString);//asking if emptyString equals to ""
    System.out.println(isStringEmpty);
    
    String s = "hello";
    System.out.println("hello".equals(s));//asking if s equals to hello

    System.out.println("hello".charAt(2));//l
    System.out.println("hello".length());

    //isEmpty()
    String s5 = "abc";
    //check if s5 is empty
    boolean isEmpty = s5.length() == 0;
    System.out.println(isEmpty);//false
    System.out.println(s5.isEmpty());//false

    //if (!s5.isEmpty) {
      
    //}

    //substring
    //string 
    String subStr = s5.substring(0, 2);
    //s5 doesnt change
    //substr is storing a new string value by "substring"
    System.out.println(s5);//abc
    System.out.println(subStr);//ab
    System.out.println(s5.substring(0, 3));//abc
    System.out.println(s5.substring(0, s5.length()));//abc
    System.out.println(s5.substring(1));//bc
  }
}
