import java.util.Scanner;

public class Tiger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tiger CLI!");

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Your number doubled is... " + (num * 2));

        scanner.close();
    }
}
