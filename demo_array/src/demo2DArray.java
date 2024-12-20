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
  }
}
