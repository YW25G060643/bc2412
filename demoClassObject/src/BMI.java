import java.math.BigDecimal;

public class BMI {
    //weight / height^2
    private double weight;
    private double height;
    public BMI(double weight, double height){
      this.weight = weight;
      this.height = height;
    }
    public double getBmi(){
      return BigDecimal.valueOf(this.weight)
      .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)))
      .doubleValue();
    }
    public static void main(String[] args) {
      BMI b1 = new BMI(60, 180);
      System.out.println(b1.getBmi());
    }
}
