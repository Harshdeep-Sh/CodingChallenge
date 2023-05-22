public class SortPeopleByHeight {
        public String[] sortPeople(String[] names, int[] heights) {
            int temp;
            String t1;
            for(int i=0;i<names.length-1;i++){
                for(int j=0;j<names.length-i-1;j++){
                    if(heights[j]<heights[j+1]){
                        temp = heights[j];
                        heights[j] = heights[j+1];
                        heights[j+1] = temp;
                        t1 = names[j];
                        names[j] = names[j+1];
                        names[j+1] = t1;
                    }
                }
            }
            return names;
        
    }
}
