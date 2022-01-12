/*
Enter the number of rows: 4
Enter symbol as you wish: 
*
   *
  ***
 *****
*******
 *****
  ***
   *
   */

import java.util.Scanner;

public class diamond {

	public static void main(String[] args) {
		
		int i,j;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows=scan.nextInt();
		System.out.println("Enter symbol as you wish: "); 
		char ch=scan.next().charAt(0);
		//read number input from user
		i=1;
		while(i<=rows){//first outer while loop iterates through the row
		  j=1;
		    while(j<=rows-i){
		     System.out.print(" ");//print star
		      j++;
		  }
		  j=1;
		  while(j<=i*2-1){
		     System.out.print(ch);//print given symbol
		      j++;
		  }
		  System.out.println();//move to next line
		   i++;
		}
		  i=rows-1; 
		while(i>=0){//second outer while loop
		  j=1;
		    while(j<=rows-i){
		     System.out.print(" ");//print space - inner wile loop
		      j++;
		  }
		  j=1;
		  while(j<=i*2-1){
		     System.out.print(ch);//print given symbol - inner while loop
		     j++;
		  }
		  System.out.println();
		  i--;
		  }
	}

}
