import java.util.Scanner;
public class inputoutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("How tall are you?");
        double tall = scanner.nextDouble();
        System.out.println("Mrs/Ms."+name+", "+age+" years old. Your height is "+tall);
        scanner.close();
        }
    }

