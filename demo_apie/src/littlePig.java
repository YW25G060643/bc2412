public class littlePig extends pig{
    //
    public littlePig(String name, int age){
      super(name, age);
    }

    public void fly(){
      System.out.println("flying...");
  }

    public static void main(String[] args) {
      pig pig1 = new pig("null");
      pig pig2 = new pig(5);

      System.out.println(pig1.getName());
      System.out.println(pig2.getName());

      Object object = new Object();
      pig myPig = new pig("null", 3);
      pig checkPig = new pig("null", 3);
      if (myPig.equals(checkPig)) {
        System.out.println("same");
      }else{
        System.out.println("not ths same");
      }
    }
//     equals()
//     toString()
//     hashCode()
 }
