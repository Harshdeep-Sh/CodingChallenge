import java.util.Arrays;
// day 23
public class FaascinatingNumber {
    public static void main(String[] args) {
        int n = 192;
        int nn = n*2;
	    int nnn = n*3;
	    int[] arr = new int[10];
	    Arrays.fill(arr,0);
	    while(n>0){
	        int ele = n%10;
	        n = n/10;
	        if(arr[ele]==1){
	            System.out.print("false1");
	            break;
	        }
	        else{
	            arr[ele] = 1;
	        }
	    }
	    while(nn>0){
	        int ele = nn%10;
	        nn = nn/10;
	        if(arr[ele]==1){
	            System.out.print("false2");
	            break;
	        }
	        else{
	            arr[ele] = 1;
	        }
	    }
	    while(nnn>0){
	        int ele = nnn%10;
	        nnn = nnn/10;
	        if(arr[ele]==1){
	            System.out.print("false3");
	            break;
	        }
	        else{
	            arr[ele] = 1;
	        }
	    }
	    if(arr[0]==1){
	        System.out.print("false4");
	    }
	    for(int i =1;i<10;i++){
	        if(arr[i]==1){
	            continue;
	        }
	        else{
	            System.out.print("false5");
	        }
	    }
        System.out.print("true");
    }
}
