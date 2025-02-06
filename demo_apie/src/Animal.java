public class Animal implements eatable{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    //contract content
    public void eat(){
        System.out.println("eating...");
    }

    public static void main(String[] args) {

        cat cat = new cat("Jimmy", 3);
        System.out.println(cat.getName());

        Animal cat2 = new cat("Mary", 0);
        cat2.eat();
        //during the compile time,
        //"Animal cat2" implies the object can be accessed in "Animal Scope"
        //hide the object instance method walk() & sleep()
        // cat2.sleep();
        // cat2.walk();

        //runtime 
        cat.eat();//find the object during runtime.
        //found that the object actually is a cat object
        //so cat2.eat() -> cat.class()`s eat()

        Animal cat3 = new Animal("Vincent", 4);
        cat3.eat();//animal is eating

        //cat3.sleep()//violate rule 1
        //cannot place a parent object to a child reference
        //cat cat4 = new Animal("Lucas")

        //Example 1:
        Animal[] animals = new Animal[3];
        animals[0] = new cat("dadw", 0);
        animals[1] = new pig("nu", 0);
        animals[2] = new Dog("sd", 9);

        cat[] cats = new cat[1];
        cats[0] = new cat("ssss", 0);

        //example 2
        shape[] shapes = new shape[3];
        shapes[0] = new circle(3.0, "red");
        shapes[1] = new circle(3.0, "red");
        shapes[2] = new square2(3.0);
        shapes[3] = new circle(3.0, "red");

        for(shape shape : shapes){
            System.out.println("area= " + shape.area());
        }

        for(shape shape : shapes){
            if (shape instanceof circle) {//check if shape is instance of circle?
                circle circle = (circle) shape;
                System.out.println(circle.getRadius());//rule 1
            }else if (shape instanceof square2) {
                square2 square2 = (square2) shape;
                System.out.println(square2.getLength());
            }
        }

        //for interface
    eatable cat4 = new cat("Tommy", 9);
    cat4.eat();//
    sleepable[] animals2 = new sleepable[2];
    animals2[0] = new cat("null", 0);
    animals2[1] = new Dog("null", 0);
    // animals2[1] = new animal("null", 0);//animal didn`t implement eatable
    animals2[0].sleep();
    animals2[1].sleep();
    // animals2[1].eat();
    }
}
