import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoTypeInference {
    public static void main(String[] args) {
      //java 10
      //once you assign the value to var variable, the variable type will be define as usual.
        var x = 3;//x is an int variable
        // x = 3.3;

        var y = 3.3;//y is a double type
        y = 3;//upcast
        System.out.println(y);//3.0

        List<List<String>> stringLists = new ArrayList<>();
        stringLists.add(Arrays.asList("ABC", "DEF"));
        stringLists.add(Arrays.asList("Vincent", "Lucas"));

        for (var List : stringLists) {
            for (var str : List) {
                System.out.println(str);
            }
        }

        //Stream flatmap
        //List<List<String>> -> List<String>
        List<String> result = stringLists.stream()
          .flatMap(e -> e.stream())
          .collect(Collectors.toList());

        System.out.println(result);

        //find all nicknames of my customers
        List<Customer> customers = Arrays
        .asList(new Customer("Vincent", "Vlau", Arrays.asList("abc", "def"))
        , new Customer("Lucas", "lll", Arrays.asList("ijk", "xyz")));

        List<String> nicknames = customers.stream()
        .filter(e -> e.getName().length() > 5)
        .flatMap(e -> e.getNickName().stream()).collect(Collectors.toList())
        .filter(e -> e.charAt(0) == 'a')
        .collect(Collectors.toList());
    }

    //java doesn`t allow defining var as variable type
    //

    public static class Customer {
        private String name;
        private String username;
        private List<String> nickname;

        public Customer(String name, String username, List<String> nickname){
            this.name = name;
            this.username = username;
            this.nickname = nickname;
        }

        public Customer(String name, String username){
            this.name = name;
            this.username = username;
        }

        public List<String> getNickName(){
            return this.nickname;
        }
    }
}
