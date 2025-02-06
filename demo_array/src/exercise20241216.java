public class exercise20241216 {
    public static void main(String[] args) {
    // The sum is 55
    // Sum values of an array
    // Declare a int array, with value 1 to 10
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    // Write a loop to sum up all value in the int array
    // code here ...
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    System.out.println("The sum is " + sum);

    // Example Output: Second Max = 230
    // Write a loop to find the second max number.
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int max = 0;
    int secondMax = 0;
    int count = 0;
    // code here ...
    for(int i = 0; i < nums.length; i++){
        if (nums[i] > max) {
          max = nums4[i];
        }
    }
    for(int i = 0; i < nums.length; i++){
        if (nums4[i] == max){
          count++;
        }
    }
    for(int i = 0; i < nums.length; i++){
        if (count > 1) {
          secondMax = max;
          break;
        }else if (nums4[i] > secondMax && nums4[i] < max) {
          secondMax = nums4[i];
        }
    }
    System.out.println(secondMax);
    }
}