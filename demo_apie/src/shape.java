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
}
