import java.math.BigDecimal;

public class demo_BigDecimal {
    public static void main(String[] args){
      double result = 0.2 + 0.1;
      System.out.println(result);
      if (result == 0.3) {
        System.out.println("result is 0.3");
      }else{
        System.out.println("result is not 0.3");
      }

      //solution
      BigDecimal bd1 = BigDecimal.valueOf(0.2);
      BigDecimal bd2 = BigDecimal.valueOf(0.1);
      BigDecimal bd3 = bd1.add(bd2);
      System.out.println(bd3);//0.3
    }
}
