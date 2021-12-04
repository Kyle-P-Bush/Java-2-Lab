
import java.util.*;
public class MaxCharTest{

    public static char maxOccuringCharacter(String sentence) throws IllegalArgumentException {
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
    
    
    
    public static void main(String[] args) {
        String s1 = "ttttaaaa";
        System.out.println(maxOccuringCharacter(s1));
    }

}
