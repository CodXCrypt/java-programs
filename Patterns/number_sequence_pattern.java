
import java.util.Scanner;

public class traingle_pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		//23
		//345
		//4567
		Scanner s= new Scanner(System.in);
		System.out.println("Enter n ");
	    int n = s.nextInt();
	    int i=1;
	    
	    while(i<=n)
	    {   int j=1;
	        int count=i;
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
