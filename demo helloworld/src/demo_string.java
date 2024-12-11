public class demo_string {
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
  }
}
