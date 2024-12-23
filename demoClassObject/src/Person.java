public class Person {//blueprint -> define a person
    //attributes个
    private String name;
    private int age;
    private String emailAddress;
    private char gender;//F/M

    //constructor (not method)
    public Person(String name, int age, String emailAddress, char gender) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    public int getNameLength(){
        return this.name.length();
    }

    public boolean isMale(){
        return this.gender == 'm' ? true : false;//封装
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

    //setter
    //void -> return type (return nothing)
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

        Person p1 = new Person("Vincent", 18 , "1234@431.com", 'm');
        System.out.println(p1.getName());//Vincent
        System.out.println(p1.getAge());//18
        System.out.println(p1.getEmailAddress());
        Person p2 = new Person("Lucas", 17, "5678@875.com", 'm');
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getEmailAddress());

        Person[] people = new Person[]{p1, p2, new Person("Dicky", 19, "1145@14.com", 'm')};
        
        for(Person c : people){
            System.out.println(c.getName() + "," + c.getAge() + "," + c.getEmailAddress());
        }
        Person p3 = p2;
        System.out.println(p3.getName() + "," + p3.getAge() + "," + p3.getEmailAddress());

        System.out.println(p1.isMale());
        System.out.println(p1.getName().length());
        System.out.println(p1.getNameLength());

        p2.setAge(30);
        System.out.println(p2.getAge());
        System.out.println(p3.getAge());

        String s1 = "hello";
        //String[] strings = new String[]{s1, "world"};
        
        //String s2 = p2;
        //String s3 = new Integer(23);
    }
}