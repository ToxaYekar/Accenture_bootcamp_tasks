import java.util.Scanner;
public class Task5 {

    static void oppositeValue(boolean value) {
        if(value) {
            System.out.printf("Opposite of %b is 'false'", value);
        }
        else if (!value) {
            System.out.printf("Opposite of %b is 'true'", value);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean value;
        System.out.print("Enter boolean value: ");
        value = sc.nextBoolean();
        sc.close();

     oppositeValue(value);
    }
}
