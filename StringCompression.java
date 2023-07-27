// Day 61 - LeetCode Problem 443: String Compression


public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length==1){
            return 1;
        }
        int pointer = 0;
        int count = 1;
        char curr = chars[0];
        for(int i =1;i<chars.length;i++){
            if(curr==chars[i]){
                count++;
            }
            else{
                if(count>=10){
                    chars[pointer] = curr;
                    pointer++;
                    char[] countArr = ("" + count).toCharArray();
                    for(char c:countArr){
                        chars[pointer] = c;
                        pointer++;
                    }
                }
                else if(count==1){
                    chars[pointer] = curr;
                    pointer++;
                }
                else{
                    chars[pointer] = curr;
                    pointer++;
                    chars[pointer] = (char)(count+'0');
                    pointer++;
                }
                curr = chars[i];
                count = 1;
                
            }
        }
        if(count>=10){
                    chars[pointer] = curr;
                    pointer++;
                    char[] countArr = ("" + count).toCharArray();
                    for(char c:countArr){
                        chars[pointer] = c;
                        pointer++;
                    }
                }
                else if(count==1){
                    chars[pointer] = curr;
                    pointer++;
                }
                else{
                    chars[pointer] = curr;
                    pointer++;
                    chars[pointer] = (char)(count+'0');
                    pointer++;
                }
        return pointer;
    }
}
