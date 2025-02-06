import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {

    public static class Person{
        private int age;
    }
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("vincent");
        System.out.println(pq);
        pq.add("Oscar");
        System.out.println(pq);
        pq.add("Lucaas");
        System.out.println(pq);
        System.out.println(pq.size());//3

        //for poll(), ordering -> String natural order
        System.out.println(pq.poll());//Lucas
        System.out.println(pq.poll());//Oscar
        System.out.println(pq.poll());//Vincent

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(65);
        pq2.add(5);
        pq2.add(62);
        pq2.add(23);
        while (!pq2.isEmpty()) {
            System.out.println(pq2.poll());
        }
    }
}
