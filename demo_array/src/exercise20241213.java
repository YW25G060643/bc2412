public class exercise20241213 {
  public static void main(String[] args){
    /**
   * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
   * and divisible by 2 (Search it from 1)
   * 
   * Expected Output: 6 12 18 24 30 36 42 48 54 60
   */
    // Print first ten numbers, which fulfill the followings criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0
    int count = 0;
    for (int i = 0; i < 100; i++) {
      if (i > 0 && i % 2 == 0 && i % 3 == 0){
        count++;
        System.out.println(i);
        if (count == 10) {
          break;
        }
       }
      }
    
     /**
   * Expected output:
   * The index of the last character of c is 11
   */
  String str = "coding bootcamp."; // You should not change this line
  char target = 'c'; // Update this target to test the logic
  int count2 = 0;
  for(int i = 0; i < str.length(); i++){
    if (str.charAt(i) == target) {
      System.out.println(i);
    }else if (str.charAt(i) != target) {
      count2++;
      if (count2 == str.length()) {
      System.out.println("Not Found");
      }
    } 
  }
  // if not found, print "Not Found."
  // code here ...

   /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
   int Seq = 0;
   int first = 0, second = 1;
   for(int i = 0; i < 15; i++){// for loop to print first 15 numbers in Fibonacci Sequence
    if (i == 0) {
      Seq = 0;
    }else if(i > 0){
      first = i--;
      second = i;
      Seq = first + second;
    }
    System.out.println(Seq);
   }
  }
}
