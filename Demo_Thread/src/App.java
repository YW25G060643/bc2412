public class App {
        //main thread : workerA
        //
    public static void main(String[] args) {
        int x = 3;
        x++;
        ++x;
        x += 1;
        System.out.println(x);

        //create another thread
        //Task & Thread
        Runnable sayHelloTask = () -> System.out.println("Hello");
        StringBuilder sb = new StringBuilder("");
        Runnable concatStringMillionTimes = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                sb.append("!");
            }
        };
        
        Thread workerB = new Thread(sayHelloTask);
        workerB.start();//main thread (WorkerA) excutes new thread (workerB)
        //main thread proceed its own task
        System.out.println(sb.length());//0(Likely), excuted by workerA (main thread)

        System.out.println("Program end");
    }
}
