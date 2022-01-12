/*
Do you want to continue?: y

Enter the no. of rows: 5
    * * * * * 
   * * * * * 
  * * * * * 
 * * * * * 
* * * * * 
*/
import java.util.Scanner;

  public class Rhombus
  {
       public static void main(String[] args)
       {    
            outer:
            while(true)
            {
               System.out.println();
                Scanner a = new Scanner(System.in);
                char y;
                System.out.print("Enter the no. of rows: ");
                int r = a.nextInt();
            
                for(int i=1;i<=r;i++)
                {
                     for(int j=1;j<=r-i;j++)
                     {  
                          System.out.print(" ");
                     }
                     for(int j=1;j<=r;j++)
                     {
                          System.out.print("*"+" ");
                     }
                     System.out.println();
                }
               System.out.print("\nDo you want to continue?: ");
                y = a.next().charAt(0);
                if (y == 'N' || y == 'n')
             {
                  break outer;
             }          } } }

