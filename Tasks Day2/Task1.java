import java.util.Scanner;
public class Task1 {

    static void check(int a, int b) {
        if (a == b) {
            System.out.printf("is %d equal to %d? - %b%n", a, b, true);
        } else {
            System.out.printf("is %d equal to %d? - %b%n", a, b, false);
        }
        if (a < b) {
            System.out.printf("is %d less than %d? - %b%n",a, b, true);
        }
        else {
            System.out.printf("is %d less than %d? - %b%n",a, b, false);
        }
        if (a <= b) {
            System.out.printf("is %d less or equal to %d? - %b%n",a, b, true);
        }
        else {
            System.out.printf("is %d less or equal to %d? - %b%n",a, b, false);
        }
        if (a > b) {
            System.out.printf("is %d greater than %d? - %b%n",a, b, true);
        }
        else {
            System.out.printf("is %d greater than %d? - %b%n",a, b, false);
        }
        if (a >= b) {
            System.out.printf("is %d greater or equal to %d? - %b%n",a, b, true);
        }
        else{
            System.out.printf("is %d greater or equal to %d? - %b%n",a, b, false);
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

        check(a,b);
    }

}
