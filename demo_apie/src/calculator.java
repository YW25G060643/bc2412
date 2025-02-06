public class calculator {
    //
    private int x;
    private int y;

    public calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int sum(){
        return this.x + this.y;
    }
    public int sum(int thirdNumber){
        return this.x + this.y + thirdNumber;
    }
    public int sum(double thirdNumber){
        return this.x + this.y + (int) thirdNumber;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator(3, 3);
        System.out.println(c1.sum());
        System.out.println(c1.sum(3));

        //static polymorphism
        //during compile time, java check the method call by method 
    }
}