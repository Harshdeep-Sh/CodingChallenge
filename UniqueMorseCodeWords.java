//Day 54 - LeetCode Problem 804: Unique Morse Code Words

import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs = new HashSet<>();
        for(String s:words){
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i<s.length();i++){
                sb.append(morse[s.charAt(i)-'a']);
            }
            hs.add(sb.toString());
        }
        return hs.size();
    }
}
