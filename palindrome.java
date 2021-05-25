import java.io.*;

public class palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num, reversedNum = 0, remainder;
        System.out.println("Enter a number to check if it is palindrome or not");
        num = Integer.parseInt(in.readLine());

        // make a copy
        int originalNum = num;

        // reverse
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");

        }

    }
}
