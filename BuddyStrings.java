import java.util.HashSet;
import java.util.Set;

class BuddyStrings{
    public boolean buddyStrings(String s, String goal) {
        if(s.length()==1 || goal.length()==1){
            return false;
        }
        if (s.equals(goal)) {
            Set<Character> temp = new HashSet<>();
            for (char c : s.toCharArray()) {
                temp.add(c);
            }
            return temp.size() < goal.length();
        }
        if(s.length()!=goal.length()){
            return false;
        }
        int i = 0;
        int j = s.length() - 1;

        while (i < j && s.charAt(i) == goal.charAt(i)) {
            i++;
        }

        while (j >= 0 && s.charAt(j) == goal.charAt(j)) {
            j--;
        }

        if (i < j) {
            char[] sArr = s.toCharArray();
            char temp = sArr[i];
            sArr[i] = sArr[j];
            sArr[j] = temp;
            s = new String(sArr);
        }

        return s.equals(goal);
    }
}