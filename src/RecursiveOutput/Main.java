package RecursiveOutput;
import java.util.Scanner;

public class Main {
    private static void recursion(int a, int b) {
        if (a < b) {
            System.out.println(a++);
        }
        else if (a > b) {
            System.out.println(a--);
        }
        else {
            System.out.println(b);
            return;
        }
        recursion(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        recursion(a, b);
    }
}
