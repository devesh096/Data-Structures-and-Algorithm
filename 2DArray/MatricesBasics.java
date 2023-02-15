import java.util.Scanner;

public class MatricesBasics {

    public static boolean search(int[][] matrix, int n) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == n) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Lets Print the Matrix

        System.out.println("Printing the Array in Matrix form");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(search(matrix, 9));

    }
}
