// day 19
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int c = 0;
        int prev_size = 0; 
        for(int i = 0;i<s.length();i++){
            hs.add((s.charAt(i)));
            if(hs.size() == prev_size){
                i=i-hs.size();
                hs.clear();
            }
            c = Math.max(c,hs.size());
            prev_size = hs.size();        
        }
        return c;
    }
}
