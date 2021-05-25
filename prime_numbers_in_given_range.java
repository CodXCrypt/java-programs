// taking low and high as inputs and displaying all prime numbers >=low and <=high
import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int low = scn.nextInt();
       int high = scn.nextInt();
       for(int i=low; i<=high; i++)
       {
           
           int count=0;
           
           for(int j=2; (j*j)<=i; j++) // (j*j)<=i is used because if that's possible then it will have 
                                       //atleast one divisor till sqrt(i)
           {
               
               if(i%j == 0 && i!=2)
               {
                   count++;
                   break;
               }
           }
           if(count == 0)
           {
               System.out.println(i);
           }
       }
  
    }
}
