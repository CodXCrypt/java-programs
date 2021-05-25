import java.util.*;

public class Anagram {

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) //If length of both strings are not same then they can't be anagram
            return false;
        
        int []fre_for_s1 = new int[256];//Frequancy array for string 1
        int []fre_for_s2 = new int[256];//Frequancy array for string 2
        
        for(int i = 0; i < s1.length(); i++){ //To count frequancy of each character in both strings
            fre_for_s1[s1.charAt(i)]++;
            fre_for_s2[s2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) { //if there exist any charactor whose frequancy is different in both strings then it can't be anagram
            if(fre_for_s1[i] != fre_for_s2[i])
                return false;
        }
        //if we can't found such character with different frequancy then we return true.
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(); //Accepting String 1
        String s2 = sc.next(); //Accepting String 2

        System.out.println(isAnagram(s1,s2));
        sc.close();
    }
}
