import java.util.Scanner;  //Rohit waghmare Roll no 213

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number of rows : ");
        int r = sc.nextInt();
        System.out.println(" enter number of columns : ");
        int c = sc.nextInt();

        int[][] x = new int[r][c];
        int[][] y = new int[r][c];

        System.out.println(" enter first matrix :");
        for (int m = 0; m < r; m++) {
            for (int n = 0; n < c; n++) {
                x[m][n] = sc.nextInt();
            }
        }
        System.out.println(" enter second matrix :");
        for (int m = 0; m < r; m++) {
            for (int n = 0; n < c; n++) {
                y[m][n] = sc.nextInt();
            }
        }

        int[][] add = new int[r][c];
        for (int m = 0; m < r; m++) {
            for (int n = 0; n < c; n++) {
                add[m][n] = x[m][n] + y[m][n];
            }
        }

        System.out.println("The addition of two matrix is : ");
        for (int m = 0; m < r; m++) {
            for (int n = 0; n < c; n++) {
                System.out.print(add[m][n] + " ");
            }
            System.out.println();
        }
        int[][] sub = new int[r][c];
        for (int m = 0; m < r; m++) {
            for (int n = 0; n < c; n++) {
                sub[m][n] = x[m][n] - y[m][n];
            }
        }
        System.out.println("subtraction of two matrices is :");
        for (int m = 0; m < r; m++) {
            for (int n = 0; n < c; n++) {
                System.out.print(sub[m][n] + " ");
            }
            System.out.println();
        }
    }
}