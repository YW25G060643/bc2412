import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for(int i = 0; i < 6; i++){
      System.out.println("hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for(int i = 0; i < 5; i++){
      System.out.println(i + ",");
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for(int i = 0; i < 21; i++){
      if (i > 0 && i < 21 && i % 2 == 0) {
        System.out.println(i);
      }
    }

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    for(int i = 0; i < 50; i++){
      if (i % 3 == 0 || i % 5 == 0) {
        System.err.println(i + ",");
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int num = 0;
    for(int i = 0; i < 16; i++){
      num = i + num;
    }
    System.err.println(num);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int oddSum = 0;
    int evenSum = 0;
    for(int i = 0; i < 10; i++){
      if (i % 2 == 0) {
        evenSum = i + evenSum;
      }else{
        oddSum = i + oddSum;
      }
    }
    System.out.println(oddSum);
    System.out.println(evenSum);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    if(str7.indexOf("d") != 0) {
      System.out.println("d is found.");
    }else{
      System.out.println("d is not found.");
    }

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    int count = 0;
    for(int i = 0; i < s8a.length() - 1; i++){
      if (s8b.substring(0, 2).equals(s8a.substring(i, i + 2))) {
        System.out.println("s8b is a substring.");
        count++;
      }else if (count == 0 && i == s8a.length() - 2) {
        System.out.println("s8b is not a substring.");
      }
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    count = 0;
    for(int i = 0; i < s9.length(); i++){
      if (s9.charAt(i) == 'p') {
        count++;
      }
    }
    System.out.println(count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for(int i = 0; i < arr10.length; i++){
      arr10[i] = arr10[i].replace('x', 'k');
    }
    System.out.println(Arrays.toString(arr10));

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    count = 0;
    for(int i = 0; i < s11.length(); i++){
      if (s11.charAt(i) >= 65 && s11.charAt(i) <= 90) {
        count++;
      }
    }
    System.out.println("count uppercase = " + count);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for(int i = 1; i <= 15; i++){
      if (i % 5 == 0 ) {
        System.out.println('*');
      }else{
        System.out.print('*');
      }
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    count = 0;
    String s13 = "lrlaudbucp";
    for(int i = 0; i < s13.length(); i++){
      if (s13.charAt(i) == 'l') {
        count++;
      }else if (s13.charAt(i) == 'r') {
        count = count + 3;
      }else if (s13.charAt(i) == 'd') {
        count = count + 2;
      }else if (s13.charAt(i) == 'u') {
        count = count + 4;
      }else{
        count--;
      }
    }
    System.out.println(count);
    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1;
    arr14[1] = 4;
    arr14[2] = 9;
    arr14[3] = -4;

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long maxValue = 0;
    long minValue = 0;
    for(int i = 0; i < arr14.length; i++){
      if (arr14[i] > maxValue) {
        maxValue = arr14[i];
      }if (arr14[i] < minValue) {
        minValue = arr14[i];
      }
    }
    System.out.println(maxValue);
    System.out.println(minValue);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    float[] arr16 = new float[]{0.2F, 0.3F, 0.6F,};

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    for(int i = 0; i < arr16.length; i++){
      arr16[i] = arr16[i] + 0.1F;
    }
    System.out.println(Arrays.toString(arr16));

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    count = 0;
    for(int i = 0; i < arr18.length; i++){
      if (arr18[i].equals(target)) {
        count++;
      }
    }
    System.out.println("count name = " + count);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
    char[] arr19 = new char[s19.length()];
    for(int i = 0; i < arr19.length; i++){
      arr19[i] = s19.charAt(i);
    }
    maxValue = -1;
    minValue = -1;
    int min19 = Integer.MAX_VALUE;
    int max19 = Integer.MIN_VALUE;
    for(int i = 0; i < arr19.length; i++){
      if (arr19[i] > max19) {
        max19 = arr19[i];
        maxValue = i;
      }
      if (arr19[i] < min19) {
        min19 = arr19[i];
        minValue = 1;
      }
    }
    char temp19 = ' ';
    temp19 = arr19[(int) maxValue];
    arr19[(int) maxValue] = arr19[(int) minValue];
    arr19[(int)minValue] = temp19;
    System.out.println(Arrays.toString(arr19));

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    int longestString = 0;
    count = 0;
    for(int i = 0; i < arr20.length; i++){
      if (arr20[i].length() > longestString) {
        longestString = arr20[i].length();
        count++;
      }
    }
    System.out.println("longest=" + arr20[count]);
    
  }
}