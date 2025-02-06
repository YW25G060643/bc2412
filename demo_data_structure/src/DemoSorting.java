import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
    public static void main(String[] args) {
        //bubble sort (Nested loop)
        List<Integer> integers = Arrays.asList(1, 2, -3, 4, 5);
        Collections.sort(integers);
        System.out.println(integers);
        int[] arr = new int[]{10, 2, 9};
        updToZero(arr);
        System.out.println(Arrays.toString(arr));//[0, 0, 0]
        //In java, array & all custon types are always pass by reference
        //primitive, wrapper class & string are always pass by value (a copy by value)
        Book book = new Book("Sun");
        changeBookName(book);
        System.out.println(book);
        //primitives
        int a = 3;
        int b = 4;
        System.out.println(sum(a, b));//300
        System.out.println(a);//3 not 100, because we pass ba value for primitives
        System.out.println(b);//4 not 200, ~
        //sort String by collection.sort()

        BigDecimal bd1 = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(3);
        System.out.println(addBigDecimal(bd1, bd2).doubleValue());//13.0
        System.out.println(bd1.doubleValue());//10.0
        System.out.println(bd2.doubleValue());//3.0
    }
    public static int sum(int x , int y){
        x = 100;
        y = 200;
        return x + y;
    }
    public static String concat(String x, String y){
        return x.concat(y);
    }
    //overflow -> int * int -> int
    //long * long -> long
    public static Long multiply(int x, int y){
        return (long) x * (long) y;//avoid overflow
    }
    public static int[] updToZero(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
        return arr;
    }
    public static void changeBookName(Book book){
        book.setName("hello");
    }
    //BigDecimal? pass by value OR reference
    //similar to String
    public static BigDecimal addBigDecimal(BigDecimal original, BigDecimal Delta){
        return original.add(Delta);//always retuan a new BigDecimal object
    }
}
