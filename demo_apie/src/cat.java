public class cat extends Animal{
    //Animal.class is a parent class
    //cat.class is a child class
    //inhert all attributes from parent class
  //private String name;
  
  //constructor
  public cat(String name){
      //this.name = name;
      super(name);//calling parent costructor
      //must be the first line to call super
  }

  //getter
//   public String getCatName(){
//       return this.name;
//   }

  public void walk(){
      System.out.println("walking...");
  }

  @Override
  public void eat(){
      System.out.println("cat is eating...");
  }
  public static void main(String[] args) {
      cat cat = new cat("null");
      System.out.println(cat.getName());
      cat.walk();//cat itself
      cat.eat();//override parent method
  }
}