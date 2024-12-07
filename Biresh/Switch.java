package Biresh;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, s = 0, x;
        System.out.println("Enter the 1st series");
        System.out.println("Enter the 2nd series");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter the number of terms");
                n = sc.nextInt();
                System.out.println("Enter the value of x");
                x = sc.nextInt();

                for (i = 1; i <= n; i++) {
                    int p = 1; // Reset p for each iteration
                    for (int j = 1; j <= i; j++) {
                        p *= j; // Calculate factorial
                    }
                    s += (int) (Math.pow(x, i) / p); // Cast Math.pow result to int
                }
                System.out.println("Result of the series: " + s);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
