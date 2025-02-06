public class BootcampExpection extends RuntimeException {
    //once you extends Exception family, your class become an expection class
    //you can now throw the object of this class
    public static void main(String[] args) {
        throw new BootcampExpection();
        //throw new cat();//Class cat didn`t extend Expection family, it cannot be throw
    }
}
