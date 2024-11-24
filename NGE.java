/*public class NGE {
     static int[] NGER(int[] arr){
        int maxElement=0;
        int[] nger=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            nger[i]=maxElement;
            maxElement=Math.max(arr[i],maxElement);
        }
        return nger;
    }
}
public static void main(String[]args){
int[] arr={1,3,4,5,7,8,7};
System.out.println(nger(arr))*/
  

public class NGE {
    static int[] nser(int[]arr){
        int[] NSER=new int[arr.length];
        int minele=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(minele==Integer.MAX_VALUE)
            NSER[i]=0;
            else
            NSER[i]=minele;
            minele=Math.min(minele,arr[i]);
        }
        return NSER;
    }
    public static void main(String[]args){
    int[] arr={4,5,7,2,9,1,2};
    for(int i:NSER){
        System.out.println(i+"");
    }
}
    
       
   

