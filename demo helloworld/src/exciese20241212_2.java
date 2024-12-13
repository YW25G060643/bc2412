import java.util.Scanner;

public class exciese20241212_2 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.println("input a month");
    int month = input.nextInt();//assume 1 - 12

    System.out.println("input a year");
    int year = input.nextInt();// > 0

    // The February has 29 days: (Every 4 years and the year cannot divded by
    // 100) or The year can divided by 400
    // otherwise the February should have 28 days only
    if (month < 1 || month > 12 || year < 1) {
      System.out.println("R U Kidding me?");
    }else{
      if(month == 4|| month == 6|| month == 9|| month == 11){
        number_Of_DaysInMonth = 30;
      }else if (month != 2) {
        number_Of_DaysInMonth = 31;
      }else{
        if ((year % 400 == 0 || year % 4 == 0 ) && year % 100 != 0) {
          number_Of_DaysInMonth = 29;
        }else{
          number_Of_DaysInMonth = 28;
        }
      }

      if (month == 1) {
        monthOfName = "Jan";
      }
      if (month == 2) {
        monthOfName = "Feb";
      }
      if (month == 3) {
        monthOfName = "Mar";
      }
      if (month == 4) {
        monthOfName = "Apr";
      }
      if (month == 5) {
        monthOfName = "May";
      }
      if (month == 6) {
        monthOfName = "Jun";
      }
      if (month == 7) {
        monthOfName = "Jul";
      }
      if (month == 8) {
        monthOfName = "Aug";
      }
      if (month == 9) {
        monthOfName = "Sep";
      }
      if (month == 10) {
        monthOfName = "Oct";
      }
      if (month == 11) {
        monthOfName = "Nov";
      }
      if (month == 12) {
        monthOfName = "Dec";
      }

      System.out.println(monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
    }
  }
}