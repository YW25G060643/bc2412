public class demo_method {

    //sum(int x, int y) -> input parameters
    //int -> return type
    public static int sum(int x, int y){
        int result = x + y;
        return result;//align return type
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

    public static void main(String[] args) {
        int x = 3;
        int a = 10;
        int b = 11;
        double y = 0;
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
    }
}
