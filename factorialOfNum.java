import java.io.*;
public class factorialOfNum
{
	public static void main(String arg[]) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             	int n;
                int fact=1;
                System.out.println("Enter number to calulate factorial");

                n = Integer.parseInt(in.readLine());
	        for(int i=1;i<=n;i++)
	  	  {
 
	    	   fact=fact*i;
 	 	  }
 
 	        System.out.println("factoral of the entered number is "+fact);
	}
}