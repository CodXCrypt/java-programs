import java.io.*;

class fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of terms");
        int n = Integer.parseInt(in.readLine());
        int i = 0, j = 1, nextTerm;
        System.out.println("Fibonacci series is ");
        for (int c = 0; c < n; c++) {
            if (c <= 1)
                nextTerm = c;
            else {
                nextTerm = i + j;
                i = j;
                j = nextTerm;
            }
            System.out.println(nextTerm);
        }
    }
}