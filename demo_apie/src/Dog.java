public class Dog extends Animal{
    // private String name;
    
    public Dog(String name){
        super(name);
    }

    // public String getName(){
    //     return this.name;
    // }
    public void walk(){
        System.out.println("walking...");
    }
    public static void main(String[] args) {
        Dog dog = new Dog("NaN");
        System.out.println(dog.getName());
        dog.walk();
    }
}
