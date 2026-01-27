package PST;

import java.util.Scanner;

class sumavg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;
        float avg;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        avg = sum / (float) n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
