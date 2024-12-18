import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class demoWhileLoop {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 3; i++){
            System.out.println(i);
        }
        int j = 0;
        while(j < 3){
            System.out.println(j);
            j++;
        }

        String s = "hello";
        char target = 'e';
        int l = 0;
        boolean found = false;
        while (l < s.length()) {
            if (s.charAt(l) == target) {
                found = true;
                break;
            }
            l++;
        }
        System.out.println(found);
        
        for(int k = 0; k < s.length(); k++){
            if(s.charAt(k) == target){
                System.out.println("true1");
            }
        }

        //random
        int number = new Random().nextInt(3);//0 - 2
        System.out.println(number);

        //1 - 47
        //int number2 = new Random().nextInt(49) + 1;//(0 -48) + 1
        //System.out.println(number2);

        int[] marksix = new int[6];
        int count = 0;
        int value = 0;
        while (count < 6) {
            value = new Random().nextInt(49) + 1;//(0 -48) + 1
            if (!isDuplicated(marksix, value)) {
                marksix[count] = value;
                count++;
            }
        }
        System.out.println(Arrays.toString(marksix));
        
    //1 - 100
    //47 is bomb

        int bomb = new Random().nextInt(100) + 1;
        System.out.println(bomb);
        int numberInput = 0;
        int minNum = 1;
        int minNumCount = 1;
        int maxNum = 100;
        int maxNumCount = 100;
        while (numberInput != bomb) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please pick a number between " + minNum + " and " + maxNum);
            numberInput = scanner.nextInt();
            if (numberInput < minNum || numberInput > maxNum) {
                continue;
            }
            if (numberInput > bomb) {
                maxNum = numberInput - 1;
            }else{
                minNum = numberInput + 1;
            }
        }
        System.out.println("bomb!");
    }

    public static boolean isDuplicated(int arr[], int newValue){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == newValue) {
                return true;
            }
        }
        return false;

    }
}
