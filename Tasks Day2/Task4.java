import java.util.Scanner;

public class Task4 {
    static void numberCheck(int number) {

        if (number % 2 == 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        sc.close();

        numberCheck(number);
    }
}
