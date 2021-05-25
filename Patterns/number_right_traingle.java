package fundamentals;

import java.util.Scanner;

public class traingle_pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		//23
		//456
		//78910
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Height of of right angle traingle");
	    int n = s.nextInt();
	    int i=1;
	    int count=1;
	    while(i<=n)
	    {   int j=1;
	    
	    	while(j<=i) {
	    		System.out.print(count);
	    		count+=1;
	    		j=j+1;
	    	}
	    	System.out.println();
	    	i=i+1;
	    }

	}

}
