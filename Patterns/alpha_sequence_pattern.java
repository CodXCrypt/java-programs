

import java.util.Scanner;

public class Alpha_pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ABCD
		//BCDE
		//CDEF
		//DEFG
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of n");
	    int n = s.nextInt();
	    int i=1;
	    while(i<=n)
	    {    char ch=(char)('A'+i-1) ;
	    	int j=1;
	    	while(j<=n){
	    		System.out.print(ch);
	    		ch=(char)(ch+1);
	    	    j=j+1;
	    	}
	    	System.out.println();
	    	i=i+1;
	    }

	}

}
