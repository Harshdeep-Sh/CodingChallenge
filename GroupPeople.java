// Day 71  - LeetCode Problem 1282. Group the People Given the Group Size They Belong To

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupPeople {
    public List<List<Integer>> groupThePeople(int[] arr) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(hm.keySet().contains(arr[i])){
                hm.get(arr[i]).add(i);
            }
            else{
                hm.put(arr[i],new ArrayList<>());
                hm.get(arr[i]).add(i);
            }
            if(hm.get(arr[i]).size()==arr[i]){
                ans.add(new ArrayList<>(hm.get(arr[i])));
                hm.get(arr[i]).clear();
            }
        }
        return ans;
    }
}
