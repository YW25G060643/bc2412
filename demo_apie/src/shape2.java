public interface shape2 {
    //problems:
    //no attribute
    //no static & default method before java 8
    double area();
    default double calculate(){
        return area() + 3;
    }
}
