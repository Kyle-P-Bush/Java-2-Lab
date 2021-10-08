//Kyle Bush
//CSCI 2121
//Strings and Exceptions
import java.util.*;

public class StringUtility {

    public static String reverse(String sentence) {
        String[] words = sentence.replaceAll("[^a-zA-Z ]", " ").replaceAll(" +", " ").toLowerCase().split("\\s+");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }
        return reverseString.toString().trim();
        
    }

    public static char maxOccuringCharacter(String sentence) throws IllegalArgumentException {
        if (sentence.equals("")){
            throw new IllegalArgumentException();
        }
        sentence = sentence.replaceAll("[^a-zA-Z ]", " ").replaceAll(" +", "").toLowerCase().trim();
        char tempArray[] = sentence.toCharArray(); 
        Arrays.sort(tempArray); 
        String s = new String(tempArray);
        int n = s.length();
        int max_count = 0;
        int count = 1;
        char ans = '-';
        for (int i = 1; i <= n; i++){
            if ((i == n) || (s.charAt(i) != s.charAt(i - 1))){
                if (max_count < count){
                    max_count = count;
                    ans = s.charAt(i-1);
                }
                count = 1;
            }
            else{
                count++;
            }
        }
        return ans;
    }

    public static String reverseForPal(String palindrome) {
        StringBuilder sb = new StringBuilder(palindrome);
        sb = sb.reverse();
        return sb.toString().toLowerCase().trim().replaceAll(" +", " ").replaceAll("[^a-zA-Z ]", "");
        
    }

    public static boolean isPalindrome(String input) {
        String a = input.toLowerCase();
        String b = reverseForPal(input).toString();
        if(a.equals(b.toLowerCase())){
            return true;
        } else{
            return false;
        }


    }
/*

    //Main tester method when writing the code. Ignore
    public static void main(String[] args){
        String s1= "This   .  Is  a   senTEnce!";
        String s2= "LevEl";
        String s3= "lOser";
        String s4 = "iiijjp";
        String s5 = "";

        System.out.println(s1);
        System.out.println(reverse(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        maxOccuringCharacter(s4);
        maxOccuringCharacter(s5);
    }
*/

}
