package PST;

import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s, rev = "";

        System.out.print("Enter a string: ");
        s = sc.nextLine();

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

