public class demoloop {
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
    int xii = 0;
    for(int i = 0; i <= 10; i++){
      if(i % 2 != 0){
        xii += i;
        System.out.println(xii + " 7");
      }else{
      }
    }
  }
}