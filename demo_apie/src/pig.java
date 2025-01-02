public class pig extends Animal{
    public pig(){
      //implicitly calling super()

        super("name");
    }
    public pig(String name){
        super(name);
    }
    public void sleep(){
        System.out.println("sleeping...");
    }

    public static void main(String[] args) {
        pig pig = new pig("error");
        pig pig2 = new pig();
        System.out.println(pig.getName());
        System.out.println(pig2.getName());
        pig.sleep();
    }
}
