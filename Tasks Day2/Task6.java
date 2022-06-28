import java.util.Scanner;

public class Task6 {

    static void check(int a, int b) {
        if ((a == b) || (a < 0 && b > 0) || (a > 100 && b > 100)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter value a: ");
        a = sc.nextInt();

        System.out.print("Enter value b: ");
        b = sc.nextInt();
        sc.close();

        check(a, b);
    }
}
