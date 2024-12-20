public class Person {//blueprint -> define a person
    //attributes个
    private String name;
    private int age;
    private String emailAddress;

    //constructor (not method)
    public Person(String name, int age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    //getter (method)
    //instance method is able to return self value
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        int x = 3;
        System.out.println(x);
        int[] arr = new int[3];

        String person = "vincent";
        int personAge = 18;

        String[] names = new String[]{"Vincent", "Lucas"};
        int[] ages = new int[]{18, 17};

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
        Person p3 = p2;
        System.out.println(p3.getName() + "," + p3.getAge() + "," + p3.getEmailAddress());

        p2.setAge(30);
        System.out.println(p2.getAge());
        System.out.println(p3.getAge());

        String s1 = "hello";
        //String[] strings = new String[]{s1, "world"};
    }
}