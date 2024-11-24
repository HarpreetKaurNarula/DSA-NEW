import java.util.ArrayList;

public class Wrapper {
    static ArrayList<Integer> findsubArray(int[] arr,int k){
        int start=0;
        int end=k-1;
        int maxsum=0;
        int index=0;
        for(int i=0;i<=end;i++){
            maxsum+=arr[i];
            int currsum=maxsum;
            while(end<arr.length-1){
                currsum-=arr[start];
                start++;
                end++;
                currsum+=arr[end];
                if(maxsum<currsum)
                    index=start;
                    maxsum=currsum;
            }
        }
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=index;i<index+k;i++){
            nums.add(arr[i]);
        }
        return nums;
    }
    public static void main(String[] args){
        ArrayList<Integer> nums=new ArrayList<>();
        int[] arr={30,30,30,10,20,1,40,40};
        nums=findsubArray(arr,k:2);
        System.out.println(nums);
    }
}

           
