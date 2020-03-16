import java.util.Scanner;

public class Show_Figure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------Menu-------------------");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        do {
            switch (choice) {
                case 1:
                    showRectangle();
                    break;
                case 2:
                    showSquare();
                    break;
                case 3:
                    showTriangle();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
        } while (choice != 0);
    }
    public static void showRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
    public static void showSquare() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
    public static void showTriangle() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
