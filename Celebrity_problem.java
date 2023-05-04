public class Celebrity_problem{

    public static void main(String[] args) {
        // int[][] arr ={{0,0,1,0},
        //               {0,0,1,0},
        //               {0,0,0,0},
        //               {0,0,1,0}};
//
        int[][] arr ={{1,1,1,1},
                      {0,1,1,1},
                      {0,0,0,0},
                      {0,0,1,1}};
         
        for (int i = 0; i < arr.length; i++) {
            int flag=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]==0){
                    flag = 1;
                }
                else{
                    flag = 0;
                    break;
                }
            }
            int celebrity = 0;
            if(flag==1){
                for (int k = 0; k < arr.length; k++) {
                    if(k==i){
                        continue;
                    }
                    if(arr[k][i]==1){
                        celebrity=1;
                    }
                    else{
                        celebrity =0;
                        break;
                    }
                }
            }
            if(celebrity==1){
                System.out.println(i + " is celebrity");
            }
        }
    }
}