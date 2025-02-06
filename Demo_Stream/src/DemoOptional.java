import java.lang.StackWalker.Option;
import java.util.Optional;

public class DemoOptional {
  //Never use optional type as attribute type
    //firstName can be null, but whai is this meaning?
    private Optional<String> firstName;
    public static void main(String[] args) {
      //caller
      //advantage: Able to avoid null pointer exception
        Optional<String> result = concat("abc", "def");
        if (result.isPresent()) {
            System.out.println(result.get());
        }
    }

    //if you decide to hava a return type of optional,
    //it impiles the result may be null

    //if a & b is null, the result is null
    public static Optional<String> concat(String a, String b){
      if (a == null || b == null) {
          return Optional.empty();
      }
      return Optional.of(a.concat(b));
    }

    //never use optional as input parameter
    //x & y still can be null (not safe)
    public static String concat(Optional<String> x, Optional<String> y);{
        if (a == null || b == null) {
            return Optional.empty();
        }
    }
}
