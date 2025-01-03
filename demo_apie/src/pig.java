public class pig extends Animal{
    private int age;
    public pig(int age){
      //implicitly calling super()

        super("name");
    }
    public pig(String name){
        super(name);
    }
    public pig(String name, int age) {
        super(name);
        this.age = age;
    }

    public boolean equals(Object obj){
        //same object -> must be same
        if (this == obj) {
            return true;
        }if (!(obj instanceof pig)) {
            return false;
        }
        pig pig = (pig) obj;//from Parent class to child class (int x = (int) 10L)
        return Object.equals(pig.getAge(), this.name) && Object.equals(pig.getName(), this.getName());
    }
    public void sleep(){
        System.out.println("sleeping...");
    }

    public static void main(String[] args) {
        pig pig = new pig("error");
        pig pig2 = new pig(1);
        System.out.println(pig.getName());
        System.out.println(pig2.getName());
        pig.sleep();
    }
}
