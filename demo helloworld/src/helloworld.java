public class helloworld {
  public static void main (String[] args){
   //让我们说中文
   //20241211 课程内容

   // ! 1, Data type (primitive)
   //int -> integer(整数)
   int x = 3;
   int nana = 7;
   double y2 = 3.2;

   //关于命名 variable java naming conversion
   //caml case(驼峰命名)
   //example: day0fweek,y2

   x = 101;//re-assign 101 to x
   x = x + 10;//from right to left
   x = x - 40;
   x = x * 3;
   x = x / 213;
   //print out:
   System.out.println(x);//output:1

   x = x + 8 * 2 / 4 +1;
   //8*2/4=4
   //x+4+1=6
   System.out.println(x);

   x = (x + 2) * 2 / (3 + 1);//=4
   System.out.println(x);

   x = ((x + 3) / (6 + 1)) * (x + 1);//=5
   System.out.println(x);

   //divide
   int x2 = 3 / 2;
   //step 1 3=int.2=int
   //step 2 int/int=int
   //step 3 3/2=1
   //step 4 assign 1 (int value) to int type variable
   System.out.println(x2);//=1

   //double
   double x3 = 3 / 2;
   //1 3=int,2=int
   //2 int/int=int
   //3 3/2=1
   //4 assign int to double(1->1.0)
   System.out.println(x3);

   double x4 = 3.0/2;
   //1 3.0=double,2=int
   //2 double/int=double
   //3 3.0/2,0=1.5
   //4 assign double to double
   System.out.println(x4);

   //divide by 0
   //! int f = 10 / 0;
   //System.out.println(f);//error happened

   //0/10
   System.out.println(0/10);//=0

   //! int x5 = 3.0/2
   //1,2,3 as x3
   //4 assign double to int (downcasting)
   //!not allow
  }
}