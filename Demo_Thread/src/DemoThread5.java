import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoThread5 {
    private Map<Integer, String> map;//HashMap is not thread-safe

    public DemoThread5() {
        this.map = new Hashtable<>();
        //this.map = Collections.synchronizedMap(new HashMap<>());//HashTable // HashMap = ArrayList + LinkedList
    }

    public String put(Integer key, String value){
        return this.map.put(key, value);
    }

    public int size(){
        return this.map.size();
    }

    public static void main(String[] args) {
        DemoThread5 central = new DemoThread5();

        Runnable putEntryTask1 = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                central.put(i, "ABC");
            }
        };

        Runnable putEntryTask2 = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                central.put(i, "DEF");
            }
        };
        
        Thread workerB = new Thread(putEntryTask1);
        workerB.start();
        
        Thread workerC = new Thread(putEntryTask2);
        workerC.start();
        
        try {
          workerB.join();//main thread wait until workerB complete the task
          workerC.join();//main thread wait until workerC complete the task
        } catch (InterruptedException e) {
          //
        }
        System.out.println(central.size());
    }
}
