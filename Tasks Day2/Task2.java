import java.util.Scanner;
public class Task2 {

    static void boolCheck(boolean b1, boolean b2) {
        if (b1 == b2) {
            System.out.printf("Are b1 and b2 equal? - %b%n",true);
        }
        else {
            System.out.printf("Are b1 and b2 equal? - %b%n",false);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b1, b2;
        System.out.print("Enter b1: ");
        b1 = sc.nextBoolean();

        System.out.print("Enter b2: ");
        b2 = sc.nextBoolean();
        sc.close();

        boolCheck(b1, b2);
    }
}
