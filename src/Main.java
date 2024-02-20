import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        a = scanner.nextInt();

        System.out.print("Please enter the first number: ");
        b = scanner.nextInt();

        System.out.print("Please enter the first number: ");
        c = scanner.nextInt();

        result = a + b * c - c;

        System.out.println("your result is: " + result);

        scanner.close();
    }
}