

import java.util.Scanner;

public class isoceles_traingle {

	public static void main(String[] args) {
		//  1  
		// 121
		//12321
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of row");
	    int n = s.nextInt();
	    int i=1;
	    while(i<=n)
	    {   
	    	int j=1;
	    	while(j<=n-i){
	    		System.out.print(" ");
	    		j=j+1;
	    	}
	    	int num=1;
	    	while(num<=i) {
	    		System.out.print(num);
	    		num=num+1;
	    	}
	    	int num1=i-1;
	    	while(num1>=1) {
	    		System.out.print(num1);
	    		num1=num1-1;
	    		
	    	}
	    	
	    	System.out.println();
	    	i=i+1;
	    }

	}

}
