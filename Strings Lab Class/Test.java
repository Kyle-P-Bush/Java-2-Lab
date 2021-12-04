import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Test{

    public static String reverse (String s){
        String answer = "";

        for (int i =0;i<s.length();i++){
            char c = s.charAt(i);
            answer = c + answer;
        }
        return answer;
    }



    public static void main (String[] args){
        System.out.print(reverse())
    }
}