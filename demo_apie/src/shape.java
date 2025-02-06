public abstract class shape {
  /*abstract class VS class
   * 1.CANNOT create object for abstract class
   * 2.both with common attribute for child class
   * 3.abstract class`s constructor is for child class to "super"
   * 
   */
    private String color;
    private double radius;

    public shape(String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public double getRadius(){
       return this.radius;
    }

    //implicitly public
    //Implication: if the child class provide area implementation
    abstract double area();

    public static shape create(char ref){
        switch (ref) {
            case 'S':
                return new square2(color, 3.0);
            case'C':
                return new circle(color, 4.0);
            default:
                return null;
        };
    }
    public static void main(String[] args) {
        //new shape"R"; //compile error
        shape.create('C', 'R');
        circle c2 = shape.create('B', 3.0);
    }
}
