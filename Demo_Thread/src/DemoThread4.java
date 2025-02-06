import java.util.ArrayList;

//solution
//Native data structure (AtomicXXX)
//Lock the action
public class DemoThread4 {
    private ArrayList<Integer> integers;

    public DemoThread4() {
        this.integers = new ArrayList<>();//polymorphism
    }

    // public ArrayList<Integer> getIntegers() {
    //     return this.integers;
    // }

    public boolean add(Integer integer) {
        this.integers.contains(2);//lock
        return this.integers.add(integer);
    }

    public int size(){
        return this.integers.size();
    }

    public static void main(String[] args) {
        DemoThread4 central = new DemoThread4();

        Runnable addMillionElements = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                central.add(i);
            }
        };
        
        Thread workerB = new Thread(addMillionElements);
        workerB.start();//main thread initialize execute another thread (workerB)
        //to execute task, The workerB execute the task ONLY

        Thread workerC = new Thread(addMillionElements);
        workerC.start();
        
        //main thread
        try {
          workerB.join();//main thread wait until workerB complete the task
          workerC.join();//main thread wait until workerC complete the task
        } catch (InterruptedException e) {
          //
        }
        System.out.println(central.size());
    }
}