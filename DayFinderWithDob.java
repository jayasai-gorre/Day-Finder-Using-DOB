import java.util.Scanner;

public class DayFinderWithDob {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter date: ");
    int date = sc.nextInt();

    System.out.print("Enter month: ");
    int month = sc.nextInt();

    System.out.print("Enter year: ");
    int year = sc.nextInt();

    int last2Digits = year % 100;
    int code =
      date +
      monthChart(month) +
      centuryChart(year) +
      last2Digits +
      (int) last2Digits /
      4;

    int day = (int) code % 7;
    boolean leap = checkLeap(year);
    if (leap == true) {
      day--;
    }
    System.out.print(date + "/" + month + "/" + year + " is ");
    dayMatch(day);
  }

  public static boolean checkLeap(int year) {
    boolean leap = false;
    if (
      (year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)
    ) {
      leap = true;
    }
    return leap;
  }

  public static int monthChart(int month) {
    int monthCode = -1;
    switch (month) {
      case 1:
        monthCode = 0;
        break;
      case 2:
        monthCode = 3;
        break;
      case 3:
        monthCode = 3;
        break;
      case 4:
        monthCode = 6;
        break;
      case 5:
        monthCode = 1;
        break;
      case 6:
        monthCode = 4;
        break;
      case 7:
        monthCode = 6;
        break;
      case 8:
        monthCode = 2;
        break;
      case 9:
        monthCode = 5;
        break;
      case 10:
        monthCode = 0;
        break;
      case 11:
        monthCode = 3;
        break;
      case 12:
        monthCode = 5;
        break;
    }
    return monthCode;
  }

  public static int centuryChart(int year) {
    int centuryCode = -1;
    if (centuryCode > 1400 && centuryCode < 1499) {
      centuryCode = 2;
    } else if (centuryCode > 1500 && centuryCode < 1599) {
      centuryCode = 0;
    } else if (centuryCode > 1600 && centuryCode < 1699) {
      centuryCode = 6;
    } else if (centuryCode > 1700 && centuryCode < 1799) {
      centuryCode = 4;
    } else if (centuryCode > 1800 && centuryCode < 1899) {
      centuryCode = 2;
    } else if (centuryCode > 1900 && centuryCode < 1999) {
      centuryCode = 0;
    } else if (centuryCode > 2000 && centuryCode < 2099) {
      centuryCode = 6;
    } else if (centuryCode > 2100 && centuryCode < 2199) {
      centuryCode = 4;
    }
    return centuryCode;
  }

  public static void dayMatch(int day) {
    switch (day) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
    }
  }
}
