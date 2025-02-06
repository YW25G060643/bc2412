public class worker {
    private static int workerCount = 0;
    private Supermarket Supermarket;

    public worker(Supermarket Supermarket){
        this.Supermarket = Supermarket;
        workerCount++;
    }

    //if read private static variable, we should 
    public void moveIn(int quantity){
        Supermarket.setAvailableStock(Supermarket.getAvailableStock() + quantity);
    }
    public void moveOut(int quantity){
        Supermarket.setAvailableStock(Supermarket.getAvailableStock() - quantity);
    }

    public static int
}
