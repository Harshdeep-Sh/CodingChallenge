import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    ArrayList<String> arr = new ArrayList<>();
    public void helper(int open, int close,StringBuilder s){

        if(open==0 && close==0){
            arr.add(s.toString());
            return;
        }
        if(open>0){
            s.append('(');
            helper(open-1,close,s);
            s.deleteCharAt(s.length()-1);
        }
        if(open<close){
            s.append(')');
            helper(open,close-1,s);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        helper(n,n,sb);
        return arr;
    }
}
