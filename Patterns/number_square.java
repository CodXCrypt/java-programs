/*
Enter the row number
6
111111
222222
333333
444444
555555
666666
*/

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the row number");
	    int n = s.nextInt();
	    int i=1;
	    
	    while(i<=n)
	    {   int j=1;
	    	while(j<=n) {
	    		System.out.print(i);
	    		j=j+1;
	    	}
	    	System.out.println();
	    	i=i+1;
	    }

	}

}
