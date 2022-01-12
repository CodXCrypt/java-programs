

import java.util.Scanner;

public class Reverse_pyramid {

	public static void main(String[] args) {
		//****
		//***
		//**
		//*
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no of row");
	    int n = s.nextInt();
	    int i=1;
	    while(i<=n)
	    {   
	    	int j=n;
	    	while(j>=i){
	    		System.out.print("*");
	    		
	    	    j=j-1;
	    	}
	    	System.out.println();
	    	i=i+1;
	    }
	

	}

}
