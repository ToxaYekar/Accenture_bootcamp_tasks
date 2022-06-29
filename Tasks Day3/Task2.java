package Day3;

public class Task2 {
    public static void main(String[] args) {
        int[] randNumArray = {132,227,35,18};

        int[] arrayCopy;
        arrayCopy = randNumArray;

        for(int i = 0; i < randNumArray.length; i++) {
            arrayCopy[i] = randNumArray[i];
        }

        System.out.println("Random number array: ");
        for (int i = 0; i < randNumArray.length; i++) {
            System.out.print(randNumArray[i] + "\t");
        }
        System.out.println();
        System.out.println("Copy of the array: ");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + "\t");
        }

        }

    }

