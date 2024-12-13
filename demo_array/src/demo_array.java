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
            if (arr4[i] >= arr4[0] && arr4[i] >= arr4[1] && arr4[i] >= arr4[2]){
                max = arr4[i];
            }
        }
        System.out.println(max);

        //find the min value in the int array
        int[] arr5 = new int[]{9, -8, -99, 98};
        int min = 0;
        for(int i = 0; i < arr5.length; i++){
            if (arr5[i] <= arr5[0] && arr5[i] <= arr5[1] && arr5[i] <= arr5[2] && arr5[i] <= arr5[3]){
                min = arr5[i];
            }
        }
        System.out.println(min);
    }
}