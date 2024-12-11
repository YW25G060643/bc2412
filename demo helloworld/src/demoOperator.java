public class demoOperator {
  public static void main(String[] args){
    //+1
    int x = 3;
    x = x + 1;
    x++;
    ++x;
    x += 1;//means x = x + 1
    System.out.println(x);

    //-1
    int y = 4;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println(y);

    //+2
    int b = 2;
    b = b + 2;
    b += 2;

    //-2
    b = b - 2;
    b -= 2;
    System.out.println(b);

    //*=,/=
    int m = 5;
    m = m * 5;
    m *= 5;
    System.out.println(m);
    int n = 125;
    n = n / 5;
    n /= 5;
    System.out.println(n);

    //++x & x++
    int a = 8;
    int result1 = ++a + 3;
    System.out.println(result1);//=12
    System.out.println(a);//9
    //1.a=9
    //2.a+3
    //3.result1=12

    int q = 8;
    int result2 = q++ + 3;
    System.out.println(result2);//=11
    System.out.println(q);//9
    //1.q+3
    //2.q=9
    //3.result2=11

    //string +=
    String s = "hello";
    s += "!";
    System.out.println(s);
    //string + anything = string
    s += 'a';
    s += 1000000000;
    System.out.println(s);
  }
}
