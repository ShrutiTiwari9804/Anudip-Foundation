 import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of rows from user
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int a=1;
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            // Move to the next line
            System.out.println();
        }

        sc.close();
    }

}

