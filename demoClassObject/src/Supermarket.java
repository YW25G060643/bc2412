public class Supermarket {
    private int availableStock;
    public Supermarket(int availableStock){
        this.availableStock = availableStock;
    }
    public int getAvailableStock(){
        return this.availableStock;
    }
    public void setAvailableStock(){
        this.availableStock = availableStock;
    }
    /*public void moveIn(int numberOfStock){
        this.availableStock += numberOfStock;
    }
    public void moveOut(int numberOfStock){
        this.availableStock -= numberOfStock;
    }
        */
    public static void main(String[] args) {
        Supermarket s1 = new Supermarket(0);
        worker worker1 = new worker(s1);
        worker worker2 = new worker(s1);
        worker1.moveIn(30);
        worker2.moveIn(4);
    }
}
