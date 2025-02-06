import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(e -> System.out.println(e));
        //it implies you won`t change the values passing to method
        numbers.forEach(System.out::println);
    }

    //instant method
    String s = "hello";
    Supplier<Integer> randomNumber = () -> new Random().nextInt(10);
    Supplier<Integer> randomNumber2 = s::length;

    //sattic method
    Function<String, Integer> stringToInteger = str -> Integer.valueOf(str);
    Function<String, Integer> stringToInteger2 = Integer::valueOf;
}
