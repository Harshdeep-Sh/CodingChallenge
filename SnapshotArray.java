import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnapshotArray {
    List<Map<Integer,Integer>> lst;
    public SnapshotArray(int length) {
        lst = new ArrayList<>();
        lst.add(new HashMap<>());
    }
    
    public void set(int index, int val) {
        int snapID = lst.size() -1;
        lst.get(snapID).put(index,val);
    }
    
    public int snap() {
        lst.add(new HashMap<>());
        return lst.size() -2;
    }
    
    public int get(int index, int snap_id) {
        for(int i = snap_id;i>=0;i--){
            if(lst.get(i).containsKey(index)){
                return lst.get(i).get(index);
            }
        }
        return 0;
    }
}
