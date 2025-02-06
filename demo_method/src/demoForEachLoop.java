public class demoForEachLoop {
  public static void main(String[] args) {
    int[] arr = new int[]{3, 4, 5};
    for(int i = 0 ; i < arr.length; i++){//just get the one value for each iteration
      System.out.println(arr[i]);
    }

    //3 + 4
    //4 + 5
    for(int i = 0 ; i < arr.length - 1; i++){
      System.out.println(arr[i] + arr[i + 1]);
    }

    int temp = 0;
    for(int i = 0; i< arr.length; i++){
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }

    //for-each
    for(int integer: arr){//just get the one value for each iteration
      //10000 lines
      System.out.println(integer);
    }

    char[] arr2 = new char[]{'p', 't', 'e'};
    String str = " ";
    for(char arr2a: arr2){
      str += arr2a;
    }
    System.out.println(str);

    String[] arr3 = new String[]{"abc", "ijk", "def"};
    String target = "ijk";
    boolean b = false;
    // -> true
    for(String s : arr3){
      if (target.equals(s)) {
        b = true;
      }
    }
    System.out.println(b);
  }
}
