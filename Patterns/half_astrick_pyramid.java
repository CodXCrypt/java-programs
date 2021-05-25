

import java.util.Scanner;

public class pyramid_2 {

	public static void main(String[] args) {
		//    *
		//   **
	  //  ***
		// ****
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Height of pyramid");
	    int n = s.nextInt();
	    int i=1;
	    while(i<=n)
	    {   
	    	int j=1;
	    	while(j<=n-i){
	    		System.out.print(" ");
	    		j=j+1;
	    	}
	    	int star=1;
	    	while(star<=i) {
	    		System.out.print("*");
	    		star=star+1;
	    	}
	    	
	    	System.out.println();
	    	i=i+1;
	    }


	}

}
