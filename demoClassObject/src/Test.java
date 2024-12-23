public class Test {
    public static void main(String[] args) {
      
      Person p1 = new Person("Vincent", 18 , "1234@431.com");
      System.out.println(p1.getName());//Vincent
      System.out.println(p1.getAge());//18
      System.out.println(p1.getEmailAddress());
      Person p2 = new Person("Lucas", 17, "5678@875.com");
      System.out.println(p2.getName());
      System.out.println(p2.getAge());
      System.out.println(p2.getEmailAddress());

      Person[] people = new Person[]{p1, p2, new Person("Dicky", 19, "1145@14.com")};
      
      for(Person c : people){
          System.out.println(c.getName() + "," + c.getAge() + "," + c.getEmailAddress());
      }

      //run time
      //
      Preson p4 = null;
      //pi.getK -> conpile error -> Person class has no getK method

      p4.getName();
      //compile OK ->

      
    }
}