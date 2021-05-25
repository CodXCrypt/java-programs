import java.io.*;
public class prime {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int number;
        boolean flag = false;
        System.out.println("Enter a number to check if it is prime or not");

        number = Integer.parseInt(in.readLine());
        
        for (int i = 2; i <= number / 2; ++i) {
      // condition for nonprime number
      if (number % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(number + " is a prime number.");
    else
      System.out.println(number + " is not a prime number.");

    }
    
}