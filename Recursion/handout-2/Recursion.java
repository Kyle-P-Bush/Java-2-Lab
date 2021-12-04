/**
 * If you do not use recursion, you will receive 0 points. You can delete the
 * content of the methods before you start your work. You should not change the
 * method definition.
 */
public class Recursion {
    public static String reverse(String s) {
        if((null==s)||(s.length()<=1)){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1, s.length()-1));
        }
        return false;
    }

    public static int length(String s) {
        /*
         * Donot return s.length() Use recursion to solve this
         */
        if(s.equals("")){
            return 0;
        } else {
            return length(s.substring(1)) + 1;
        }


    }
}