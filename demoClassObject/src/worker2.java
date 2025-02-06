public class worker2 {
    public worker2(){

    }

    public void moveIn(int quantity){
        Supermarket2.availableStock += quantity; 
    }

    public void moveOut(int quantity){
        Supermarket2.availableStock -= quantity;
    }
    public int checkStockQuantity(){
        return Supermarket2.availableStock;
    }

    public static void main(String[] args) {
        worker2 w1 = new worker2();
        w1.moveIn(2);
        w1.moveOut(3);
        System.out.println(w1.checkStockQuantity());
    }
}
