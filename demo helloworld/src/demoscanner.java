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

    for(int i = 0; i < num ; i++){
      System.out.println("hello");
    }
  }
}