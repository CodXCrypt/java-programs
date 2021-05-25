

import java.util.Scanner;

public class Alpha_pattern {

	public static void main(String[] args) {
		//ABCD
		//ABCD
		//ABCD
		//ABCD
		Scanner s= new Scanner(System.in);
		System.out.println("Enter n ");
	    int n = s.nextInt();
	    int i=1;
	    while(i<=n)
	    {   int j=1;
	    	while(j<=n){
	    		 
	    		System.out.print((char)('A'+j-1));
	    	    j=j+1;
	    	}
	    	System.out.println();
	    	i=i+1;
	    }

	}
}
