

import java.util.Scanner;

public class pattern_3 {

	public static void main(String[] args) {
		//1234
		//1234
		//1234
		//1234
 
		Scanner s= new Scanner(System.in);
		System.out.println("enter width of square");
	    int n = s.nextInt();
	    int i=1;
	    
	    while(i<=n)
	    {   int j=1;
	    	while(j<=n) {
	    		System.out.print(j);
	    		j=j+1;
	    	}
	    	System.out.println();
	    	i=i+1;
	    }
	}

}
