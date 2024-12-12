public class demoloop {
  public static void main(String[] args){
    //2^100
    int x = 2;
    x = x * 2;
    x *= 2;
    System.out.println(x);

    //for loop
    //for( once ; check ;  ){
    //}
    //"i = 3"-> continue criteria
    //"i++"-> modifier
    //you have to let the modifier work with continue criteria,
    //so that the continue criteria become false one day
    for(int i = 0; i < 3; i++){
      System.out.println("hi");
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
      System.out.println(ii);
    }
    for(int iii = 0; iii < 10 ; iii++){
      if (iii % 2 != 0) {
      }else{
        System.out.println(iii);
      }
    }
  }
}