import java.math.BigDecimal;
import java.util.Arrays;

public class demo_array {
    public static void main(String[] args){
        int x = 3;
        int x1 = 10;
        int x2 = 11;

        //declare array
        int[] arr = new int[3];
        //assign value to array
        arr[0] = 3;
        arr[1] = 10;
        arr[2] = 11;
        //for loop -> read array value
        //print all value which >= 10
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 10) {
                continue;
            }
            System.out.println(arr[i]);
        }

        //declare double array, length = 5
        //10.4; 4.3; 3.3; 1.9; 9.9;
        //Sum up all value in the double array
        double Sum = 0;
        double[] arr1 = new double[5];
        arr1[0] = 10.4;
        arr1[1] = 4.3;
        arr1[2] = 3.3;
        arr1[3] = 1.9;
        arr1[4] = 9.9;
        for(int i = 0; i < arr1.length; i++){
            Sum = Sum + arr1[i];
        }
        System.out.println(Sum);

        //String array
        String[] arr2 = new String[5];
        arr2[0] = "abc";
        arr2[1] = "def";
        arr2[2] = "ghi";
        arr2[3] = "jkl";
        arr2[4] = "mno";
        //targeting "abc"
        String target = "abc";
        for(int i = 0; i < arr2.length; i++){
            if (target.equals(arr2[i])) {
                System.out.println("No." + (i + 1) + " true");
            }else{
                System.out.println("No." + (i + 1) + " false");
            }
        }

        //char
        char[] arr3 = new char[]{'b', 'c', 'a'};
        //convert char to int value and assign them to a new array
        int[] arr4 = new int[arr3.length];
        for(int i = 0; i < arr3.length; i++){
            arr4[i] = arr3[i];//char -> int value
            System.out.println(arr4[i]);
        }
        //find the max ASCII value in the array
        int max = 0;
        for(int i = 0; i < arr4.length; i++){
            if (arr4[i] > max){
                max = arr4[i];
            }
        }
        System.out.println(max);

        //find the min value in the int array
        int[] arr5 = new int[]{9, -8, -99, 98};
        int min = 0;
        for(int i = 0; i < arr5.length; i++){
            if (arr5[i] < min ){
                min = arr5[i];
            }
        }
        System.out.println(min);

        int[] arr6 = new int[]{9, 8, 99, 98};
        int sum = 0;
        for(int i = 0; i < arr6.length; i++){
            sum = sum + arr6[i];
        }

        //swap
        int left = 9;
        int right = 7;
        int center = 0;
        center = left;
        left = right;
        right = center;
        System.out.println(left);
        System.out.println(right);

        int[] arr7 = new int[]{9, -8, 109, 99, 98};
        int count1 = 0;
        for(int i = 0; i <= arr.length; i++){
            if (arr7[i] > arr7[i + 1]) {
                count1 = arr7[i];
                arr7[i] = arr7[i + 1];
                arr7[i + 1] = count1;
            }
        }
        for(int j = 0; j <= arr.length; j++){
            if (arr7[j] > arr7[j + 1]) {
                count1 = arr7[j];
                arr7[j] = arr7[j + 1];
                arr7[j + 1] = count1;
        System.out.println(Arrays.toString(arr7));
            }
         }
        int[] arr8 = new int[]{9, -8, 109, 99, 98};
        //print (9 + -8)
        //print (-8 + 109)
        //...
        //print (99 + 98)
        for(int i = 0; i < arr8.length - 1; i++){
            System.out.println(arr8[i] + arr8[i + 1]);
        }

        Integer[] arr9 = new Integer[]{9, 6, 4};
        //products for all numbers
        int count2 = 0;
        for(int i = 0; i < arr9.length; i++){
            count2 = arr9[i]++;
        }
        System.out.println(count2);

        double[] prices = new double[]{8.2, 6.5, 10.5};
        int[] quantities = new int[]{9, 8, 3};
        //8.2*9+6.5*8+10.5*3
        double plus = 0;
        for(int i = 0; i < prices.length; i++){
            plus += prices[i] * quantities[i];
        }
        System.out.println(plus);//157.3

        String s = String.valueOf(123);
        System.out.println(s);//123
        s = String.valueOf(true);
        System.out.println(s);//true

        System.out.println(String.valueOf('a'));

        Integer i1 = Integer.valueOf("123");//
        System.out.println(i1);
        //Integer i1 = Integer.valueOf("right");//java.lang.NumberFormatException

        //hello -> h, e, l, l, o
        char[] chArr = "hello".toCharArray();
        System.out.println(Arrays.toString(chArr));
        //hello -> olleh
        char memory;
        for(int i = 0; i < chArr.length / 2; i++){//0, 1
            memory = chArr[i];
            chArr[i] = chArr[chArr.length - 1 - i];
            chArr[chArr.length - 1 - i] = memory;
        }
        String result = "";
        for( int i = 0; i < chArr.length; i++){
            result += chArr[i];
        }
        System.out.println(result);

        //h -> 1, e -> f, i -> m, ...
        //ifmmp
        chArr = "hello".toCharArray();
        for(int i = 0; i < chArr.length; i++){
            chArr[i] += 1;//chArr[i] = (char) (chArr[i] + 1);
        }
        System.out.println(String.valueOf(chArr));

        char[] arr10 = new char[]{'p', 'a', 'p', 'b', 'a', 'p'};
        int[] arr11 = new int[6];
        //loop > 1
        char maxNumChar = ' ';
        int maxNumInt = 0;
        for(int i = 0; i < arr10.length; i++){
            arr11[i] = arr10[i];
        }
        for(int i = 0; i < arr11.length; i++){
            if (arr11[i] > maxNumInt) {
                maxNumInt = arr11[i];
            }
        }
        maxNumChar =(char) maxNumInt;
        System.out.println(maxNumChar);//'p'

        //another way
        maxNumChar = ' ';
        int[] counters = new int[26];
        for(int i = 0; i < arr10.length; i++){
            counters[arr10[i] - 'a']++;
        }
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < counters.length; i++){
            //max2 = Math.max(counters[i]; max2);
            if (counters[i] > max2) {
                maxNumChar = (char) (i + 'a');
                max2 = counters[i];
            }
        }
        System.out.println(maxNumChar);

        //
        int[] arr12 = new int[]{20, -20, 90, 50, -40};
        //sorting without create a new array
        //move the max to tail
        int temp = 0;
        for(int i = 0; i < arr12.length - 1; i++){
            for(int j = 0; j < arr12.length - i - 1; j++){
                if (arr12[j] > arr12[j + 1]) {
                    temp = arr12[j];
                    arr12[j] = arr12[j + 1];
                    arr12[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr12));
    }
}