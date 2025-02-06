import java.math.BigDecimal;
import java.math.RoundingMode;

public class BMI {
    //weight / height^2
    private double weight;
    private double height;//instance
    private char gender;

    //can be more than one constructor
    public BMI(double weight, double height, char gender){
      this.weight = weight;
      this.height = height;
      this.gender = gender;
    }

    //empty constructor
    public BMI(){

    }

    //constructor is same as method, not allow same constructor signature
    
    public double getWeight(){
      return this.weight;
    }
    public double getHeight(){
      return this.height;
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

    public char genderInfo(){
      return this.gender;
    }

    public static void main(String[] args) {
      BMI b1 = new BMI(60, 1.80, 'M');
      System.out.println(b1.getBmi());//18.52
      System.out.println(b1.bmiInfo());//normal weight
      System.out.println(b1.genderInfo());
      System.out.println(b1.getBmi(60, 1.80));

      //constract of an empty method
      BMI b2 = new BMI();
      System.out.println(b2.getWeight());
      System.out.println(b2.getHeight());
    }
}