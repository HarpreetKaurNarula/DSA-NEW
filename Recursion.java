/*public class Recursion {
    static int fact(int n){
        if(n==0||n==1)
        return 1;
        int x=n*fact(n-1);
        return x;
    }
    public static void main(String[] args){
        int n=5;
        
        System.out.println(fact(n));
    }
    
}*/

/*public class Recursion {
    static int fact(int n,int k){
        if(k==0||k==1)
        return k;
        int k=n*fact(n-1);
        return x;
    }
    public static void main(String[] args){
        int n=5;
        
        System.out.println(fact(n));
    }
    
}*

/*public class Recursion {
    static int pow(int a,int b){
        if(b==0);
        return 1;
     int x=a*pow(a,(b-1));
        return x;
    }
    public static void main(String[] args){
        int a=3;
        int b=3;
        
        System.out.println(pow(a,b));
    }
    
}*/

//last 2 occurance
/*public class Recursion{
    static int fibo(int k){
        if(k==0 || k==1)
        return k;
        int fibo1=fibo(k-1);
        int fibo2=fibo(k-2);
        return fibo1+fibo2;


    }
    public static void main(String[] args){
        System.out.println(fibo(10));
    }
}*/

/*public class Recursion{
    static void generatesubsequence(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        generatesubsequence(ques.substring(1),ans+ques.charAt(0));
        generatesubsequence(ques.substring(1),ans);
        
            
    }
    public static void main(String[] args){
        generatesubsequence("CAR","");
    }
}*/

/*public class Recursion{
    static void cointoss(int num,String ans){
        if(num==0){
            System.out.println(ans);
            return;
        }
        cointoss(num-1,ans+"H");
        cointoss(num-1,ans+"T");
        
            
    }
    public static void main(String[] args){
        cointoss(3,"");
    }
}*/

/*public class Recursion{
    static int countcointoss(int num,String ans){
        if(num==0 ){
            return num;
        }
        int l=countcointoss
        cointoss(num-1,ans+"H");
        cointoss(num-1,ans+"T");
        
            
    }
    public static void main(String[] args){
        cointoss(3,"");
    }
}*/

/*public class Recursion{
    static int countsubsequence(String ques){
        if(ques.length()==0){
            
            return 1;
        }
        int l=countsubsequence(ques.substring(1));
        int r=countsubsequence(ques.substring(1));
        return l+r;
    }
    public static void main(String[] args){
        System.out.print(countsubsequence("CAR"));
    }
}*/

//generate valid paranthesis
/*public class Recursion{
    static void generateparanthesis(
        int n,String ans,int l,int r){
            if(l==n && r==n){
            System.out.println(ans);
            return;
            }
            if(l<n)
            generateparanthesis(n,ans+"{",l+1,r);
            if(r<l)
            generateparanthesis(n,ans+"}",l,r+l);
        }
        public static void main(String[] args){
            generateparanthesis(n,ans+,l,r);
        }
}*/

/*public class Recursion{
    static void permutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            permutation(s1+s2,ans+ques.charAt(i));
        }
    }
    public static void main(String[] args){
        permutation("ABC","");
    }
}*/

/*public class Recursion{
    static void mergesort (int[] arr,int low,int high){
        if(low<high){
            int mid=(high+low)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    static void merge(int[] arr,int low,int mid,int high){
        int size=high-low+1;
        int[] temp=new int[size];
        int i=mid,j=high,k=size-1;
        while(i>=low && j>=mid+1){
            if(arr[i]>arr[j]){
                temp[k]=arr[i];
                i--;
            }
            else{
                temp[k]=arr[j];
                j--;
            }
            k--;
        }
        while(i>=low){
            temp[k]=arr[i];
            i--;k--;
        }
        while(j>=mid+1){
            temp[k]=arr[j];
            k--;
            j--;
        }
        for(i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    public static void main(String[] args){
        int[] arr=(4,5,6,1,2,7,8,9);
        int low=0;
        int high=arr.length-1;
        System.out.println("");


    }
        }*/

//quicksort//
/*public class Recursion {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    //display
    static void display(int[] arr)
    {
        for (int i:arr) 
            System.out.print(i + " ");
        System.out.println();
    }
}
*/
//keypad//

//Rat in a maze//
/*public class Recursion{
    static int[][] sol= new int[100][100];
    static void display(int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(sol[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    static boolean RIAM(char[][] maze,int i,int j, int n, int m){
        //base case
        if(i==n-1 && j== m-1){
            sol[i][j]=1;
            display(n, m);
            return true;
        }

        if( i>=0 && i<n && j>=0 && j<m && maze[i][j]!='X' && sol[i][j]==0){
            sol[i][j]=1;
            //Right
            RIAM(maze, i, j+1, n, m);
            //Down
            RIAM(maze, i+1, j, n, m);
            //Left
            RIAM(maze, i, j-1, n, m);
            //Up
            RIAM(maze, i-1, j, n, m);

            //Backtracking
            sol[i][j]=0;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] maze = {
            {'0', '0', '0', '0', 'X'},
            {'0', 'X', 'X', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', '0', '0'},
            {'0', '0', '0', 'X', '0'}
        };

        RIAM(maze, 0, 0, 5, 5);
        // display(5, 5);
    }
}*/

//suduko solver//
/* 
import java.util.Scanner;
public class Recursion {
    //Validate Sudoku
    static boolean canPlace(int[][] mat, int i, int j, int n, int number){
        //for checking rows and cols
        for(int x=0;x<n;x++)
            if(mat[x][j]==number|| mat[i][x]==number)
                return false;
        //For Checking Subblock
        int rn= (int)Math.sqrt(n);
        int sx= (i/rn)*rn;
        int sy= (j/rn)*rn;
        //check inside a subblock
        for(int x=sx;x<sx+rn;x++)
            for(int y=sy;y<sy+rn;y++)
                if(mat[x][y]==number)
                    return false;
        //No issues with this number :)
        return true;
    }


    static boolean sudokuSolver(int[][] mat, int i,int j, int n){
        if(i==n)
            return true; 
        if(j==n)
            return sudokuSolver(mat, i+1, 0, n);//out of bound
        if(mat[i][j]!=0)
            return sudokuSolver(mat, i, j+1, n);// prefilled

        for(int num=1;num<=9;num++){
            if(canPlace(mat, i, j, n, num)){
                mat[i][j]=num;
                if(sudokuSolver(mat, i, j+1, n))
                    return true;
            }
        }
        //backtrack
        mat[i][j]=0;
        return false;
    }
    //Main Function to create and print sudoku
    public static void main(String[] args) {
        int n=9;
        Scanner sc= new Scanner(System.in);
        
        int mat[][] = new int[n][n];
        //input
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]= sc.nextInt();

        sudokuSolver(mat, 0,0, n);
        //display
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        sc.close();
        
    }
    
}*/

public class Recursion{
    static int[][] board;
        //display
        static void display(int[][] mat){
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++)
                    System.out.print(mat[i][j]+" ");
                System.out.println();
            }
        }
        //Recursive Code
        static boolean nQueens(int[][] board, int i, int n){
            if(i==n){
                //display
                display(board);
                return true;
            }
    
            for(int j=0;j<n;j++){
                if(check(board, i, j, n)){
                    board[i][j]=1;
                    if(nQueens(board, i+1, n))
                        return true;
                    //backtrack
                    board[i][j]=0;
                }
            }
            return false;
        }
        //Check Safe
        static boolean check(int[][] board, int i, int j, int n){
            //col
            for(int k=0;k<i;k++)
                if(board[k][j]==1)
                    return false;
            //left diagonal
            int x=i-1, y=j-1;
            while(x>=0 && y>=0){
                if(board[x--][y--]==1)
                    return false;
            }
            //Right diagonal
            x=i-1; y=j+1;
            while(x>=0 && y<n){
                if(board[x--][y++]==1)
                    return false;
            }
            return true;
        }
    
        //Main Function
        public static void main(String[] args) {
            int n=4;
            board= new int[n][n];
    
            nQueens(board, 0,n);
        }
    }
