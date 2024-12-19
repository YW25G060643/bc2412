import java.math.BigDecimal;
import java.math.RoundingMode;

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

      //subtract
      BigDecimal bd4 = BigDecimal.valueOf(0.3);
      BigDecimal bd5 = BigDecimal.valueOf(0.1);
      BigDecimal bd6 = bd4.subtract(bd5);
      System.out.println(bd6);

      BigDecimal bd7 = BigDecimal.valueOf(0.1);
      BigDecimal bd8 = BigDecimal.valueOf(0.2);
      BigDecimal bd9 = bd7.multiply(bd8);
      System.out.println(bd9);

      BigDecimal bd10 = BigDecimal.valueOf(0.3);
      BigDecimal bd11 = BigDecimal.valueOf(0.1);
      BigDecimal bd12 = bd10.divide(bd11);
      System.out.println(bd12.doubleValue());

      BigDecimal bd13 = BigDecimal.valueOf(10);
      BigDecimal bd14 = BigDecimal.valueOf(3);
      BigDecimal bd15 = bd13.divide(bd14, BigDecimal.ROUND_DOWN);
      System.out.println(bd15.doubleValue());//3.0

      BigDecimal bd16 = BigDecimal.valueOf(4.565);
      System.out.println(bd16.setScale(2, RoundingMode.HALF_DOWN));//4.56
      System.out.println(bd16.setScale(2, RoundingMode.HALF_UP));//4.57
      
      BigDecimal bd17 = BigDecimal.valueOf(4.566);
      System.out.println(bd17.setScale(2, RoundingMode.HALF_DOWN));//4.57
      System.out.println(bd17.setScale(2, RoundingMode.HALF_UP));//4.57

      BigDecimal bd18 = BigDecimal.valueOf(4.566);
      System.out.println(bd18.setScale(2, RoundingMode.DOWN));//4.56
      System.out.println(bd18.setScale(2, RoundingMode.UP));//4.57

      //square
      double length = 4.2;
      BigDecimal length1 = BigDecimal.valueOf(length);
      BigDecimal squArea = length1.multiply(length1);
      System.out.println(squArea);

      //math
      double Pi = 3.14159;
      double radius = 4.5;
      double circleArea = BigDecimal.valueOf(radius)
      .multiply(BigDecimal.valueOf(radius))
      .multiply(BigDecimal.valueOf(Pi))
      .doubleValue();
      System.out.println(circleArea);

      circleArea = BigDecimal.valueOf(Math.pow(2.0, radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
      System.out.println(circleArea);

      int x = 8;
      int y = 9;
      int max = Integer.MIN_VALUE;
      max = Math.max(x, max);//if (x = max),max = x
      max = Math.max(y, max);//if (y = max),max = y
      
      int[] arr = new int[] { 10, 9, 3};
      for(int i = 0; i < arr.length; i++){
        max = Math.max(arr[i], max);
      }

      //math.min
      System.out.println(Math.sqrt(9));//auto convert int to double
      System.out.println(Math.sqrt(10));
      System.out.println(Math.sqrt(-10));//NaN

      //round() -> nearst to integer
      System.out.println(Math.round(3.456));//3
      System.out.println(Math.round(3.556));//4
      double u = 3.456;
      System.out.println(Math.round(u * 100) / 100.0);//3.46
      double u2 = 3.556;
      
      System.out.println(Math.abs(-9L));//9
    }
}