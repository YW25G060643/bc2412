public class exercise202412 {
  public static void main (String[] args){
    double pricef0rapple = 7.3;
    double pricef0rorange = 6.5;
    int quantity0fapple = 3;
    int quantity0forange = 4;
    double x = pricef0rapple * quantity0fapple;
    double y = pricef0rorange * quantity0forange;
    double totalamount = x + y;
    System.out.println(totalamount);

    int engScore = 73;
    int mathScore = 60;
    int histScore = 61;
    int totalScore = engScore + mathScore + histScore;
    double averScore = totalScore / 3;
    System.out.println(averScore);
  }
}