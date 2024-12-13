public class demoforloop {
  public static void main(String[] args){
    //2^100
    int x = 2;
    x = x * 2;
    x *= 2;
    System.out.println(x+ " 1");

    //for loop
    //for( once ; check ;  ){
    //}
    //"i = 3"-> continue criteria
    //"i++"-> modifier
    //you have to let the modifier work with continue criteria,
    //so that the continue criteria become false one day
    for(int i = 0; i < 3; i++){
      System.out.println("hi 2");
    }
    //1. int i = 0;
    //2. i > 3 (question) -> true
    //3. if true, print "hello"
    //4. i++, i -> 1
    //5. 2.
    //6. if true, print "hello"
    //7. i++, i -> 2
    //8. 2.
    //9. if true, print "hello"

    for(String ii = "hell";ii.length() != 10; ii += "o"){
      System.out.println(ii + " 3");
    }
    for(int i = 0; i < 10 ; i++){
      if (i % 2 != 0) {
      }else{
        System.out.println(i + " 4");
      }
    }

    //print 0 - 100, divided by 3 and 4
    for(int i = 0; i <= 100; i++){
      if (i % 3 == 0 && i % 4 == 0) {
        System.out.println(i + " 5");
      }else {
      }
    }
    //sum up 0 - 20: 0 + 1 + 2...+ 20
    int xi = 0;
    for(int i = 0; i <= 20; i++){
      xi = xi + i;
      System.out.println(xi + " 6");
    }
    //System.out.println(i); i is declared  within the loop
    
    //sum up all odd number between 0 - 10
    //sum up all odd number between 0 - 10
    //the difference between evenSum & oddSum -> positive number
    int oddSum = 0;
    int everSum = 0;
    for(int i = 0; i <= 10; i++){
      if(i % 2 != 0){
        oddSum += i;
      }
      if (i % 2 == 0) {
        everSum += i;
      }
    }
    System.out.println(oddSum  + " 7");
    System.out.println(everSum + " 7.5");
    int diff = oddSum - everSum;
    //int diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
    if (diff < 0) {
      diff *= -1;
    }
    System.out.println(diff + " 7.5.5");
    //searching
    String str = "abcdefghdjk";
    //1. check if 'd' exists in the string.
    boolean found = false;
    for(int i = 0; i <= str.length(); i++){
      if (str.charAt(i) == 'd'){
        found = true;
        System.out.println(found + " 8");
        break;//break the nearest loop
      }
      //test cases
      //1. "abcdefijk"
      //2. "abcefijk"
      //3. ""
      //4. "abcdefijkd"

    }
    //2. check if the string value contains given sub-string
    String substr = "loq";
    String str1 = "hello";
    //hel - loq
    //ell - loq
    //llo - loq
    //lo? - loq
    boolean isSubExist = false;
    for(int i = 0; i < str1.length() - substr.length() - 1; i++){
      if (str1.substring(i, i + substr.length()).equals(substr)) {
        isSubExist = true;
        break;
      }
    }
    System.out.println(isSubExist + " 9");

    //couting
    String s = "hello";
    //count the number of 'l'
    //for if
    int num = 0;
    for(int i = 0; i < s.length(); i++){
      if (s.charAt(i) == 'l') {
        num += 1;
      }
    }
    System.out.println("there`s " + num + " Ls");

    //continue -- skip the rest, go to next loop
    num = 0;
    for(int i = 0; i < s.length(); i++){
      if (s.charAt(i) != 'l') {
        continue;
      }
      num++;
    }
    System.out.println(num + " 10");
    
    //1 - 100, print all numbers which can divide by 3 and 4
    //continue
    for(int i = 1; i < 101; i++){
      if (i % 3 != 0 || i % 4 != 0 ) {
        continue;
      }
      System.out.println(i + " 11");
    }

    //nested loop
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 4; j++){
        System.out.println("* 12");//print at next line
        //System.out.print("* 12");//print at one line
      }
      //-> i++
    }
    //!1. i = 0; j = 0; *
    //2. i = 0; j = 1; *
    //3. i = 0; j = 2; *
    //4. i = 0; j = 3; *
    //!5. i = 1; j = 0; *
    //6. i = 1; j = 1; *
    //7. i = 1; j = 2; *
    //8. i = 1; j = 3; *
    //!9. i = 2; j = 0; *
    //10. i = 2; j = 1; *
    //11. i = 2; j = 2; *
    //12. i = 2; j = 3; *

    //* 
    //**
    //***
    //****
    int n = 4;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < i + 1; j++){
          System.out.print('*');
      }
      System.out.println();
    }

    //    *
    //   ***
    //  *****
    // *******
  }
}