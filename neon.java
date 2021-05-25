import java.io.*;
class neon{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("N = ");
        int n = Math.abs(Integer.parseInt(br.readLine()));
        int s = n * n;
        int sum = 0;
        while(s != 0){
            int d = s % 10;
            sum += d;
            s /= 10;
        }
        if(n == sum)
            System.out.println(n + " is not a Neon Number.");
        else
            System.out.println(n + " is a Neon Number.");
    }
}