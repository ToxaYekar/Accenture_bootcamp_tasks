package Day3;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int row = 1, column = 1;
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = row * column;
                column += 1;
                System.out.printf("%d * %d = %d%n", i + 1, j + 1, array[i][j]);
            }
            row += 1;
            column = 1;
        }
        System.out.println();
        for (int[] ints : array) {
            for (i = 0; i < ints.length; i++) {
                System.out.print(ints[i] + "\t");

            }
            System.out.println();
        }

    }
    }

