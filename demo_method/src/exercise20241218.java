public class exercise20241218 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...
    int count = 0;
    for(int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'J') {
        System.out.println(str.charAt(i));        
      }else if (str.charAt(i) == 'e') {
        count++;
        if (count < 2) {
          System.out.println(str.charAt(i));
        }
      }
    }

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    for(int i = 0; i < str.length(); i++){
      if (i == 3 || i == 9|| i == 10) {
        System.out.println(str.indexOf(str.charAt(i)));
      }
    }

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    System.out.println(str.replace("Java", "Coding"));

    // int length()
    // prints 19
    // code here ...
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    count = 0;
    while (count != str.indexOf("r")) {
      count++;
    }
    System.out.println(str.substring(count, count + 3));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(str.replace('e', '*').concat("!!!").toUpperCase());

  }
}
