import java.math.BigDecimal;

public class circle extends shape{
    //parent class: color
    //square, triangle...
    //area() return false
    private double radius;

     public circle(double radius, String color){
         super(color);
         this.radius = radius;
     }
    public void getArea(double radius){
        System.out.println(BigDecimal.valueOf(Math.pow(2.0, radius))
        .multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue());
    }

    public static void main(String[] args) {
        // circle circle1 = new circle();
        // circle1.getArea(5.0);
        // System.out.println(circle1.getColor());
    }
}