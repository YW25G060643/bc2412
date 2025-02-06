import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("ABC");//add() belongs to collection family
        strings.add("DEF");
        strings.add("ABC");
        System.out.println(strings.size());
        strings.remove(0);
        System.out.println(strings);
        strings.remove("ABC");
        System.out.println(strings);
        strings.add("Oscar");
        strings.add("Jenny");
        strings.remove();//remove the head
        System.out.println(strings);
        System.out.println(strings.contains("Jenny"));//true

        //contains(),add(), remove(Object, obj), etc. are common method for ArrayList & LinkedList
        System.out.println(strings.isEmpty());//false
        
        strings.clear();
        System.out.println(strings.size());//0

        //LinkedList advantges: add/remove, head/tail
        //array/array advantages: point the object directly if you know the position
        //person.class(name);

        //List<Integer> ss = new ArrayList<>();
        List<Integer> ss = new ArrayList<>();
        ss.add(100);
        ss.add(1000);
        // because of Interface List, ss object can invoke add() at compile time.
        // during runtime, we found the objects is LinkedList, the add() method will be the Linkedlist one

        //ss.remove() -> not OK, List interface don`t contain remove()
        LinkedList<Integer> ss2 = (LinkedList<Integer>) ss;
        ss2.remove();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Tiger());
        animals.add(new Panda());
        for(Animal animal : animals){
            
        }
    }
}
