public class Dog extends Animal implements keepAlive{
    // private String name;
    
    // constructor (class CANNOT inhert parent constructor)
    public Dog(String name, int age){
        //this.name = name;
        super(name, age);
    }

    // public String getName(){
    //     return this.name;
    // }

    //walk
    public void walk(){
        System.out.println("walking...");
    }

    @Override
    public void sleep(){
        System.out.println("sleeping...");
    }

    @Override
    public void drink(){
        System.out.println("drinking...");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("NaN", 7);
        System.out.println(dog.getName());
        dog.walk();
        dog.sleep();
    }
}
