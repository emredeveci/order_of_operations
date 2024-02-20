import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        a = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        b = scanner.nextInt();

        System.out.print("Please enter the third number: ");
        c = scanner.nextInt();

        result = a + b * c - b;

        System.out.println("Your result is: " + result);

        scanner.close();
    }
}