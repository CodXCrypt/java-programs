// This is a java program to convert any base number into any base
import java.util.*;
public class AnyBaseToAnyBase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//Scan the number
        int b1 = sc.nextInt();//Base of current number
        int b2 = sc.nextInt();//base in which you want to convert
        int ans = Any(n,b1,b2);//answer
        System.out.println(ans);
        sc.close();
    }
    public static int Any(int n, int b1, int b2) {
        int answer=0,last_degit,pos=1;
        
        while (n>0) {
            last_degit = n%b2;
            n/=b2;
            answer += last_degit*pos;
            pos *= b1;
        }
        return answer;
    }
}
