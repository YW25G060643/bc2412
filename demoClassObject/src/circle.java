import java.math.BigDecimal;

public class circle {
    private double radius;
    //private String color

    //constructor
    public circle(double radius){
      this.radius = radius;
    }

    //getter
    public double getPerimeter(){
      return this.radius;
    }

    //setter
    public void setRadius(double radius){
      this.radius = radius;
    }

    //instance method
    public double calculateArea(){
      return BigDecimal.valueOf(this.radius)
      .multiply(BigDecimal.valueOf(this.radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
    }

    //static method: cannot call "this"
    //design definition -> input -> ouput
    public static double calculateArea2(double radius){
      return BigDecimal.valueOf(radius)
      .multiply(BigDecimal.valueOf(radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
    }

    public static void main(String[] args) {
      circle c1 = new circle(3.0);
      System.out.println(c1.calculateArea());//28.274333882308138
      
      System.out.println(circle.calculateArea2(3.0));
    }
}
