public class demoConditional {
  public static void main(String [] args){
    //if -> check event ->event result
    int x = 3;
    if (x > 2){
      System.out.println("x is > 2");
    }

    String s = "hello";
    //check if length > 3
    if (s.length() > 3){
      System.out.println("s is > 3");
    }else{
      System.out.println("s is < 3");
    }

    if (s.equals("hello")){
      System.out.println("s = hello");
    }
    char firstChar = s.charAt(s.length() - s.length());
    if ('h' == firstChar) {
      System.out.println("s`s first number = h");
    }

    if (x > 5){
      System.out.println("x > 5");
    }else{
      System.out.println("x <= 5");
    }

    int y = 10;
    //check if y is an even number
    if (y % 2 == 0){
      System.out.println("y is an even number");
    }else{
      System.out.println("y is an odd number");
    }

    //check if y > 3 and an even number
    if (y > 3 && y %2 ==0){
      System.out.println("y > 3");
      System.out.println("y is an even number");
    }

    char k = 'k';
    if (k == 'k') {
      System.out.println("k = k");
    }
   int age = 18;
   boolean isAdult = age >= 18;
   if (isAdult == false) {
    System.out.println("child");
   }
   if (isAdult == true) {
    System.out.println("adult");
   }

   int score = 69;
   char gender = 'f';
   String grade = "";
   //>=90 grade A ,between 89&80 grade B ,between 79&70 grade C <70 fail
   //>=90 grade A ,between 89&85 for female grade B+ ,between 89&87 for male grade B+ between 80&84 grade B.
   //between 79&70 grade C <70 fail
   if (score >= 90) {
    grade = "A";
   }else if (score <= 89 && score >= 85 && gender == 'f' || score <= 89 && score >= 87 && gender == 'm') {
    grade = "B+";
   }else if (score >= 80) {
    grade = "B";
   }else if (score <= 79 && score >= 70) {
    grade = "C";
   }else if (score < 70) {
    grade = "Fail";
   }
   System.out.println("grade " + grade);
   //test cases
   //1.m.90->A
   //2.f.90->A
   //3.m.87->B+
   //4.f.85->B+
   //5.m.86->B
   //6.f.84->B
   //7.m.79->C
   //8.f.79->C
   //9.m.69->Fail
   //10.f.69->Fail
  }
}