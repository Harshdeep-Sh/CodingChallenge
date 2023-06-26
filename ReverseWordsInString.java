// Day 38 - LeetCode Problem 152: Reverse Words In a String

public class ReverseWordsInString{
    public String reverseWords(String s) {
        String ans = "";
        String container = "";
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && container ==""){
                continue;
            }
            else if(s.charAt(i)==' '){
                ans+=" "+container;
                container = "";
            }
            else{
                container = s.charAt(i)+container;
            }
        }
        ans = ans+" "+container;
        if(ans.charAt(0)==' '){
            ans = ans.substring(1);
        }
        if(ans.charAt(ans.length()-1)==' '){
            ans = ans.substring(0,ans.length()-1);
        }
        return ans;
    }
}