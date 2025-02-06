public interface walkable {
  //no instance variable
  //all methods are abstract(100% abstract)
  //everything in interface is implicitly public
  //support "static final" variable 
  //no constructor
  //aft. java 8
    int x = 3;//implicitly static final
    void walk();//abstract method

    //after java 8, we can use default instance method
    default void walkFaster(){
        System.out.println("A way to walk faster");
    }

    //after java 8, we can use static method in interface
    static int calculateDistance(){
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(walkable.x);//3
        //walkable.x = 4;//static final
        //walkable.walkFaster();
        System.out.println(walkable.calculateDistance());
    }
}
