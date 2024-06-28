package QUEUE;

public class MinimumNumberOfKConsecutiveFlip {
    public static void flip(int[]arr,int k){
        int count=0;
        for (int i = 0; i <= arr.length-k; i++) {
            if(arr[i]==0){
                for(int j=i;j<i+k;j++){
                    if(arr[j]==0){
                        arr[j]=1;
                    }else{
                        arr[j]=0;
                    }
                }count++;
            }
        }System.out.println(count);
    }public static void main(String[] args) {
        int[]arr={0,1,0,1};
        flip(arr, 2);
    }
}
