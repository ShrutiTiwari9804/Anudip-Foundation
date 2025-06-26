import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of rows from user
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" \n");
                num++;
            }
            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}
