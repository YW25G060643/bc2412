public abstract class shape {
  /*abstract class VS class
   * 1.CANNOT create object for abstract class
   * 2.both with common attribute for child class
   * 3.abstract class`s constructor is for child class to "super"
   * 
   */
    private String color;

    public shape(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    //implicitly public
    //Implication: if the child class provide area implementation
    abstract double area();
}
