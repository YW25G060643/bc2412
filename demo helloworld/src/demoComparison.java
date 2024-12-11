public class demoComparison {
  public static void main(String[] args) {
    //>,<,>=,<=,!=,==(true & false)
    //"=="->asking if they are equal
    //"="->assigment

    int age = 70;
    boolean isAdult = age >= 18;//defnation
    System.out.println(isAdult);

    double pi = 3.1415926535;
    boolean isCorrect = pi == 3.1415926535;
    System.out.println(isCorrect);

    char op0rnot = 'Y';
    boolean not0p = op0rnot !='Y';
    System.out.println(not0p);

    float price = 10.2f;
    System.out.println(price != 10.2f);
    System.out.println(price != 10.2);

    //operator ! (not)
    boolean result = !(isAdult);
    System.out.println(result);
    if (age >= 18) {
    }
    if (!(age >= 18)) {
    }
    if (!isAdult) {
    }

    //&& and
    int age2 =30;
    char gender = 'f';
    boolean result2 = age2 >=30 && gender == 'm';
    System.out.println(result2);

    //|| or
    boolean result3 = age2 >=30 || gender == 'm';
    System.out.println(result3);

    boolean result4 = age2 < 30 || gender == 'm';
    System.out.println(result4);

    //and or (true and (fales or true))
    boolean result5 = age2 >=30 && (gender == 'm' || op0rnot == 'Y');
    System.out.println(result5);

    //|| or (false ||false)
    boolean result6 = age2 == 20 || gender =='m';
    System.out.println(result6);

    int x10 = 5;
    int y10 = 10;
    int z10 = x10 += 3 * y10;
    System.out.println(z10);//35
    
    int x = 3;
    int y = (x++ + 3) * x++;
    System.out.println(y);//= 24
    System.out.println(x);//= 5
    //1. 3 + 3
    //2. x = 4
    //3. 6 * 4
    //4. assignment
    //5. x becomes 4
  }
}
