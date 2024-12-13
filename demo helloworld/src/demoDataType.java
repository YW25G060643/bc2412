public class demoDataType {
  public static void main (String[] args){
    System.out.println("hello world!");
   //让我们说中文
   //20241210 课程内容

   // ! 1, Data type (primitive)
   //int -> integer(整数)
   int x = 3;
   int nana = 7;
   double y2 = 3.2;
   double z = nana /  y2;
   System.out.println(z);

   //关于命名 variable java naming conversion
   //caml case(驼峰命名)
   //example: day0fweek,y2

   //x cannot be declared twice

   int x100;

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

   //! store integer. java: int,byte,short,long
   int value1 = 1000000000;
   int value2 = 1_000_000;
   int maxInteger = 2_147_483_647;
   int minInteger = -2_147_483_648;
   //byte->int value
   byte b1 = -128;
   byte b2 = 127;
   //short->int value
   short s1 = -32768;
   short s2 = 32767;
   //long->int value
   //2,147,483,648->int
   long l1 = -2^63L;
   long l2 = 2^63-1;
   //long l3 = 11111111111111111111L;
   long l3 = 1111111111111111111L;//->"L"declare its a long valve

    //bMax = bMax + 1;//(not safe for java)
   b2 = (byte) (b2 + 1);//(not safe for java)(force to do)
   System.out.println(b2);

   int output = b1 + 100;//(safe for java)
   System.out.println(output);

   //1.compile time & 2.run time
   //1.1.java.file(.java)->class file(.class):java code->byte code(close to machine code)
   //1.1.1.compile fail. for example(missing: syntax error)
   //1.1.2.compile success -> class file
   //1.2 java virtual machine(JVM):class file -> machine code 
   //float,double
   double d1 = 10.2;// ->double value 
   double d2 = 10.2d;// ->double value
   float f1 = 10.2222222f;// ->float value

   float f2 = 20.2f;
   double d3 = f2;//safe for java
   //float f5 = d3;//not safe for java

   double d4 = 10.2f;//upcasting
   
   //char
   char c = 'x';
   char c1 = '1';
   char cSpace = ' ';//[space]

   //boolean
   boolean bo1 = true;
   boolean bo2 = false;

   int age = 66;
   boolean isElderly = age > 65;//"age > 65"=asking if age > 65
   System.out.println(isElderly);

   int age2 = 18;
   boolean isChild = age2 < 18;
   System.out.println(isChild);

   int remainder = 10 % 3;
   System.out.println(remainder);

   char q = 'a';
   int u = q;//char can be assigned to int
   System.out.println(u);//97
   //char -> int

   char q2 = 97;
   System.out.println(q2);//a

   //ASCII code (0-127)
   //48 == 0; 65 == A; 97 == a

   char q3 = 48;
   System.out.println(q3);//0
   int u3 = q3;
   System.out.println(u3);//48

   char q4 = '鈊';//int -> char: not safe
   int u4 = q4;
   System.out.println(q4 + " , " + u4);

   //byte -> short -> int -> long -> float -> double
   //char -> int -> long -> float -> double
  }
}