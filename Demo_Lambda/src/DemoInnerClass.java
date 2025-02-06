public class DemoInnerClass {
    private int x;

    public void setX(int x){
        this.x = x;
    }

    public void print(){
        System.out.println("Outer.print()" + this.x);

        class Cat {
            private int age;
        
            public Cat(int age){
                this.age = age;
            }

            public int getAge(){
                return this.age;
            }
        }

        Cat cat = new cat(10);
        System.out.println(cat.getAge());
    }

    public static class Library {
        //
    }

    public class student {//inner class
        private int y;

        public void print(){
            //Student object is able to read outer class object attribute directly
            System.out.println("Student.print(): x=" + x + ",y=" + y);
        }

        public void setY(){
            this.y = y;
        }
    }

    public static void main(String[] args) {
        DemoInnerClass.Library Library = new DemoInnerClass.Library();

        DemoInnerClass dic = new DemoInnerClass();
        DemoInnerClass.student student = dic.new student();//NOT parent-child relationship

        dic.setX(10);
        student.setY(20);
        dic.print();
        student.print();

        //Annoymous Inner Class (Before java 8)
        Swimable person = new swimable(){
            int count = 0;
            @Override
            public void swim() {
                this.count++;
                System.out.println("Annoymous Object");
            }

            public int getCount(){
                return this.count;
            }
        };
        //person.getCount();//Static polymorphism
        //bot if you create preson.class implements swimmable,
        //then the person object may contain addiontial attractor

        //
        Swimable person2 = () -> System.out.println("Lambda Expresson Object");
    }

    @FunctionalInterface
    private static
}
