import java.math.BigDecimal;
import java.math.RoundingMode;

public class BMI {
    //weight / height^2
    private double weight;
    private double height;

    public BMI(double weight, double height){
      this.weight = weight;
      this.height = height;
    }
    
    //instance method
    public double getBmi(){
      return BigDecimal.valueOf(this.weight)
      .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2, RoundingMode.HALF_UP)
      //.setScale(2, RoundingMode.HALF_DOWN) -> for operation '+', '-', '*'
      .doubleValue();
    }

    //static method
    public static double getBmi(double weight, double height){
      return BigDecimal.valueOf(weight)
      .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2, RoundingMode.HALF_UP)
      .doubleValue();
    }

    public String bmiInfo(){
      double bmi = this.getBmi();
      if (bmi < 18.5) {
        return "underweight";
      }else if (bmi >= 18.5 && bmi <= 24.9) {
        return "normal weight";
      }else if (bmi > 24.9 && bmi < 30) {
        return "overweight";
      }else if (bmi >= 30 && bmi < 34.9) {
        return "obese";
      }else{
        return "extremely obese";
      }
    }

    public static void main(String[] args) {
      BMI b1 = new BMI(60, 1.80);
      System.out.println(b1.getBmi());//18.52
      System.out.println(b1.bmiInfo());//normal weight
      System.out.println(b1.getBmi(60, 1.80));
    }
}