import java.util.Arrays;

public class demo2DArray {
  public static void main(String[] args){
    int arr[] = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    System.out.println(Arrays.toString(arr));

    //2DArray
    int[][] arr2d = new int [2][3];//2 rows * 3 colums
    arr2d[0][0] = 100;
    arr2d[1][2] = 100;

    for(int i = 0; i < arr2d.length; i++){//how many rows = arr2D.length
      for(int j = 0; j < arr2d[i].length; j++){
        System.out.println(arr2d[i][j]);
      }
    }

    //1st row = 100, 0, 0
    //2nd row = 0, 0, 100
    int[][] arr2d2 = new int[][] {{100, 0, 0}, {0, 0, 100}};
    System.out.println(Arrays.deepToString(arr2d2));//[[100, 0, 0], [0, 0, 100]]

    int[][] arr2d3 = new int[][] {{100, 7, 9}, {101, -9, 100}};
    int rowLength = arr2d3[1].length;//3
    //find the max value of each row, and then put it into a new array
    int[] roMaxs = new int[arr2d3.length];
    int max = Integer.MAX_VALUE;
    int idx = 0;
    for(int i = 0; i < arr2d3.length; i++){
      max = Integer.MIN_VALUE;
      for(int j = 0; i < arr2d3[i].length; j++){
        max = Math.max(arr2d3[i][j], max);
      }
      roMaxs[idx++] = max;
    }
    System.out.println(Arrays.toString(roMaxs));
  }
}
