import java.math.BigDecimal;

public class Cat {
    public static double calculateArea2(double radius){
        return BigDecimal.valueOf(radius)//
        .multiply(BigDecimal.valueOf(radius))//
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();//
    }
    public static void main(String[] args) {
        System.out.println(Cat.calculateArea2(1));
        Cat C1 = new Cat();
    }
}
