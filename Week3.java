/*public class Week3 {
    static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=minimumvalue(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    static int minimumvalue(int[] arr,int a){
    int mini=a;
    for(int i=a+1;i<arr.length;i++)
    if(arr[mini]>arr[i])
    mini=i;
    return mini;
}

static void display(int[]arr){
    for(int i:arr){
        System.out.print(i+" ");
        System.out.println();
    }
}
public static void main(string[]args){
    int[]arr={8,5,9,1,2,4};
    int a=4;
    selectionsort(arr);
    System.out.println(minimumvalue(arr,a));
    display(arr);
}
}*/

public class Week3 {
    import java.util;

    static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
        }
    }
    static void display(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[]arr={8,5,9,1,2,4};
        arrays.sort(arr);
        display(arr);
    }
}*/



