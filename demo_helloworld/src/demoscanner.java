import java.util.Scanner;
//JDK vs java project (load built-in toos such as String, Primitives)
//proactively import non-built-in tools (scanners etc.)
public class demoscanner {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("please input a number");
    int num = scanner.nextInt();//scanner.next
    //System.out.println("num = " + num);

    //scanner.nextLine();

    //System.out.println("please input a string");
    //String str = scanner.nextLine();
    //System.out.println("string = " + str);

    //for(int i = 0; i < num ; i++){
    //  System.out.println("hello");
    //}

    //num -> numbers of days
    //for loop
    int totalMinutes = 0;
    int totalHours = 0;
    for(int i = 0; i < num; i++){
      totalHours += 24;
      for(int j = 0; j < 24; j++){
        totalMinutes += 60;
      }
    }
    System.out.println(totalMinutes);
    System.out.println(totalHours);
  }
}