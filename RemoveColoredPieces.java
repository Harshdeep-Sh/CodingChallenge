// Day 73 - LeetCode Problem 2038: Remove Colored Pieces if Both Neighbors are the Same Color

public class RemoveColoredPieces {
    public boolean winnerOfGame(String colors) {
        int al = 0;
        int bo = 0;
        int ac = 0;
        int bc = 0;
        for(char i:colors.toCharArray()){
            if(i=='A'){
                ac+=1;
                if(ac==3){
                    al+=1;
                    ac--;
                }
                // bo+=bc/3;
                bc=0;

            }
            else if(i=='B'){
                bc+=1;
                if(bc==3){
                    bo+=1;
                    bc--;
                }
                // al+=ac/3;
                ac=0;
            }
        }
        
        // System.out.print(al + " " + bo);
        if(al==0 || al<=bo){
            return false;
        }
        return true;
    }
}
