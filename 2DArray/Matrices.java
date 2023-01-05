import java.util.*;

public class Matrices {

    public static int searchLargest(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    public static int searchMinimum(int matrix[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements of the Matrix ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("Enter the number for matrix " + i + " " + j);
                matrix[i][j] = sc.nextInt();
            }
        }

        // printing the matrix
        System.out.println("Printing the elements of the matrix ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // search the largest element in the matrix
        int largest = searchLargest(matrix);
        System.out.println("Largest Element of the array is " + largest);

        int minimum = searchMinimum(matrix);
        System.out.println("Minimum Element of the array is " + minimum);
    }

}