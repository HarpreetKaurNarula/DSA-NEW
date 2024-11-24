/*import java.util.Scanner;
public class Questions{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("");
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[][] matrix=new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        spiralsearch(matrix,M,N);
    }
    public static void spiralsearch(int[][] matrix,int M,int N){
        int top=0;
        int bottom=M-1;
        int right=N-1;
        int left=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(matrix[top][i]+ "");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right]+ "");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(matrix[bottom][i]+ "");
                }
                bottom--;
                
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(matrix[i][left]+ "");
                }
                left++;
            }
        }
    }
}*/

/*import java.util.Scanner;
public class Questions{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        sc.close();
        System.out.println(isPalindrome(S));
    }

    public static boolean isPalindrome(String S){
        int left=0;
        int right=S.length()-1;
        while(left<right){
            if(S.charAt(left)!=S.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}*/

import java.util.Scanner;
public class Questions{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sc.close();
        int result=search(arr,target);
        System.out.println(result);
    }
    public static int search(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[left]<=arr[mid]){
                if(arr[left]<=target && target<=arr[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return-1;
        
    }
}
                       