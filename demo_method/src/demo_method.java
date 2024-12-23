public class demo_method {

    //sum(int x, int y) -> input parameters
    //int -> return type
    //"sum(int x, int y)" -> method signature
    public static int sum(int x, int y){
        int result = x + y;
        return result;//align return type
    }

    //java doesn`t allow "different type" for the same method signature
    //public static long sum(int x, int y)

    //not allowed: Same method signature
    //"sum(int a, int b)" = sum(int x, int y)
    //Same method name + Same parament list

    public static int sum(int a, double b){
        return 1;
    }

    public static int sum(double a, int b){
        return 1;
    }

    public static double sum(int a, String b){
        return a + Integer.valueOf(b);// int + int -> int -> double
    }

    public static double subtract(double x, double y){
        return x - y;
    }

    public static int countCharactor(String source, char target){
        int num = 0;
        for(int i = 0; i < source.length(); i++){
            if (source.charAt(i) == target) {
                num++;
            }
        }
        return num;
    }

    public static int totalMinuts(int day){
        int minutes = 0;
        return minutes = day * 24 * 60;
    }

    public static int countEven(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        double y = sum(a, b);
        System.out.println(y);//21
        a = 19;
        b = 21;
        y = a + b;
        System.out.println(y);//40

        //call sum() method
        y = subtract(10, 11);
        System.out.println(y);
        y = subtract(19, 21);
        System.out.println(y);

        System.out.println(subtract(100, 98));
        
        System.out.println(countCharactor("hello", 'l'));
        System.out.println(countCharactor("abc", 'l'));
        System.out.println(countCharactor(" ", 'l'));
        System.out.println(countCharactor("leave", 'l'));

        sum(1, 2.0);
        sum(1, 2);
        sum(1.0, 2);
        System.out.println(sum(2, "123"));//125.0

        //System.out.println(minutes);
        //System.out.println(countEven(new long[] {1L; 2L; 10L;}));
        //System.out.println(countEven(new Int[] {1; 2; 10;}));
    }
}
