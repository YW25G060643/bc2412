import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
    public static void main(String[] args) {
        //FIFO
        Queue<String> strings = new LinkedList<>();//LinkedList -> add/remove head/tail
        strings.add("Oscar");
        strings.add("Vincent");
        strings.add("Lucas");

        String head = strings.poll();//removefirst
        System.out.println(head);
        System.out.println(strings);

        //quene Interface hidden lots of funtions of LinkedList
        strings.remove();//similar to poll()
        System.out.println(strings.contains("Lucas"));//true

        //look up the head element, not pick up
        System.out.println(strings.peek());//Lucas
        System.out.println(strings.size());//1

        strings.offer("Jenny");
        Queue<String> qq = new ArrayBlockingQueue<>(3);
        System.err.println(qq.offer("ABC"));//
        System.err.println(qq.offer("DEF"));//true
        System.err.println(qq.offer("HIJ"));//
        System.err.println(qq.offer("XYZ"));//false

        //for-each support Queue
        for(String s : strings){
            System.out.println(s);
        }

        List<String> newStrings = new ArrayList<>();
        newStrings.add("AAA");
        newStrings.add("BBB");
        newStrings.add("CCC");
        newStrings.add("DDD");
        newStrings.add("EEE");
        newStrings.add("FFF");
        newStrings.add("GGG");
        newStrings.add("HHH");
        strings.addAll(newStrings);
        System.out.println(strings);
    }
}
