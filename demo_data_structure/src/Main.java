import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // 创建一个按降序排列的优先级队列
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // 添加元素到优先级队列
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);

        // 打印并移除优先级最高的元素（最大的元素）
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
