public class DemoRecursion {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);//55

        //recursion
        System.out.println((sum(10)));//55

        int n = 8;
        int result = n % 2 == 1 ? product(n) : product(n - 1);
        System.out.println(result);
    }

    //1 * 3 * 5 * 7 * ... * n
    public static int product(int n){
        if ( n <= 1) {
            return 1;
        }
        return n * product(n - 2);
    }

    public static int sum(int value){
        //base criteria
        if (value <= 1) {
            return value;
        }

        //invoke oneself
        return value + sum(value - 1);
    }
}
