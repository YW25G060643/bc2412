import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoLambda {
    public static void main(String[] args) {
        //java lambda expression -> Stream, Optional
        //2014 Java8

        //Java built-in Lambda Function
        //y = f(x), input -> output

        //stringLength -> functionName
        //s(input)
        //s.length() (output)
        Function <String, Integer> stringLength = s -> s.length();//skip "return" keyword
        System.out.println(stringLength.apply("hello"));

        //input (String & String) s1 & s2
        //output(Integer)
        BiFunction<String, String, Integer> totalLength = 
          (s1, s2) -> s1.length() + s2.length();
        System.out.println(totalLength.apply("Oscar", "Lucas"));
        
        //superfunction (Interface), 3 input 1 output

        Consumer<String> printString = s -> System.out.println("The string is: " + s);
        printString.accept("hello");
        printString.accept("Goodbye");

        //Custom FunctionInterface Swimable
        swimable Lucas = () -> System.out.println("Lucas is swimming");
        Lucas.swim();//Lucas is swimming
        //lambda Assumption: FunctionalInterface -> one method only -> Lambda expression

        //MathOperation
        MathOperation addition = (x, y) -> x + y;
        MathOperation subtract = (x, y) -> x - y;
        System.out.println(addition.operate(1, 2));
        System.out.println(subtract.operate(2, 1));

        books.ForEach(b -> System.out.println(b.GetID()));
        //one than 1 line
        books.ForEach(b -> {String message = "hello"; System.out.println(b.GetID() + " " + message);});

        Map<String, String> fruitMap = new HashMap<>();
        fruitMap.put("Orange", "abc");
        fruitMap.put("Apple", "def");
        fruitMap.forEach((key, value) -> {System.out.printLn("Key=" + key + "value=" + value);
        });

        Predicate<Integer> isLargeThan8 = x -> x > 8;
        System.out.println(isLargeThan8.test(9));//true
        System.out.println(isLargeThan8.test(8));//false

        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
        System.out.println(isLargeThan8.test(9));//true
        System.out.println(isLargeThan8.test(10));//true

        books.removeIf(null);

    }
    public static class Book{
        private int id;
        public Book(int id){
            this.id = id;
        }
        public int GetID(){
            return this.id;
        }
    }

    //Similar to consumer.class
    public static void printString(String s){
        System.out.println("The string is: " + s);
    }

    //Similar to consumer.class
    public static int randomMarkSixNumber() {
        return new Random().nextInt(49) + 1;// 1 0 49
    }

    //Similar to function .class
    public static Integer stringLength(String s) {
        return s.length();
    }

    List<Book> books = new ArrayList<>();
}
