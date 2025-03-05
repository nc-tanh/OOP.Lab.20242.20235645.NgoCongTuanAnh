import java.util.Scanner;
public class cal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Sum of 2 numbers: "+ (a+b));
        System.out.println("Different of 2 numbers: "+ (a-b));
        System.out.println("Product of 2 numbers: "+a*b);
        System.out.println("Quantient of 2 numbers: "+a/b);
        scanner.close();
    }
}
