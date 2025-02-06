import java.math.BigDecimal;

public class circle extends shape{
    //parent class: color
    //square, triangle...
    //area() return false

     public circle(double radius){
         this.radius = radius;
     }

    public void getArea(double radius){
        System.out.println(BigDecimal.valueOf(Math.pow(2.0, radius))
        .multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue());
    }

    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }if (!(obj instanceof circle)) {
            return false;
        }
        circle circle1 = (circle) obj;
        return Object.equals(circle1.area(), this.area());
    }
    @Override
    public int hashCode(){
        return Object.hash(this.getRadius(), super.getRadius());
    }

    public static void main(String[] args) {
        circle circle1 = new circle();
        circle1.getArea(5.0);
        System.out.println(circle1);
    }
    circle c1 = new circle(3.0);
}