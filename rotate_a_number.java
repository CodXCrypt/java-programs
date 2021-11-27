/*question: 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
            2. Take as input n and k.
            3. Print the rotated number.
            4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
               n = 12340056
               k = 3
               r = 05612340 */
import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
    
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int temp,count=0,temp1;
     temp1 = n;
     // -->condition 1: for k less than number of digits and positive, exactly k number of digits will come forward and rest array will shift backwards
     // eg: n=543689 and k=2
     // rotation no. 1: 954368 rotation no. 2: [89]5436 -> k digits came in front and rest array shifted
     while(temp1 > 0) 
     {
        temp1 = temp1 / 10;
        count++;
     }
     if(k > 0)
     {
         k = k % count;
         if(k == 0)
         {
             k = count;//after k=no. of digits repetations, we get actual number back
         }
     }
     else //if k is less than 0 
     {
         if(k == 0) k=count; 
         else 
         {
             k = (-k) % count;
             k = count - k;// negative k is equivalent to (count-k) value of positive k 
         }
     }
     // code described below is to shift required digits in front and shift rest array rightwards
     temp = n % ((int) Math.pow(10,k));
     n = n - temp;
     n  = n / ((int)Math.pow(10,k));
     n = n + (temp * ((int ) Math.pow(10,count-k)));
     System.out.println(n);
    }
   }
