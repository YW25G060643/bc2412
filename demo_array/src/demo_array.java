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
    }
}