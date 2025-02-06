import java.math.BigDecimal;

//the T in "class, instance variable, instance method" are with same definition
//but the T in static method 
public class box<T> extends Shape{
    //
    private T[] shapes;

    public box(){
        this.shapes = (T[]) new Shape[2];
    }

    //the T in instance method refers to the definition T of class
    public void addShape(int index, T shape){
        this.shapes[index] = shape;
    }
    public double totalArea(){
        // this.shapes[0];
        BigDecimal total = BigDecimal.valueOf(0,0);
        for(Shape shape : this.shapes){
            total = BigDecimal.valueOf(shape.area()).add(total);
        }
        return total.doubleValue();
    }

    //the T in static method is not referring the T in class
    public static <T extends Shape> double totalArea2(T[] shapes){
      BigDecimal total = BigDecimal.valueOf(0,0);
        for(Shape shape : shapes){
            total = BigDecimal.valueOf(shape.area()).add(total);
        }
        return total.doubleValue();
    }

    public static void main(String[] args) {
        box<circle> box1 = new box<>();
        box1.addShape(0, new circle(3.0));
        box1.addShape(1, new circle(4.0));
        System.out.println(box1.totalArea());

        box<Shape> b2 new box<>();
        b2.addShape(0, new circle(3.0));
        b2.addShape(1, new circle(4.0));
        System.out.println(b2.totalArea());
      }
}
