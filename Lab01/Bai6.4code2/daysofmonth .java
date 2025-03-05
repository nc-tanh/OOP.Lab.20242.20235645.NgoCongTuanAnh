import java.util.Scanner;
public class daysofmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid year(4-digit non negative number): ");
        int year = scanner.nextInt();
        if (year < 1000) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        System.out.println("Year you have entered: " + year);

        boolean isLeap;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        System.out.println("Enter a valid month: ");
        int month = scanner.nextInt();

        if (month > 12 || month < 1) {
            System.out.println("Invalid month");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 2) {
            if (isLeap) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
        }

        scanner.close();
    }
}
