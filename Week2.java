/*public class Week2 {
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.print(a+""+b);
    }

        public static void main(String[]args){
        int a=15;
        int b=27;
        swap(a,b);
        
    } 
}*/

/*public class Week2 {
    static void natural(int n){
        for(int i=1;i<=n;i++){
        System.out.print(i+"");
        }
    }

        public static void main(String[]args){
        int n=10;
        natural(n);
        }
    }*/

/*public class Week2 {
    static boolean checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
            return true;
        }
        return true;
    }
    public static void main(String[]args){
        int n=11;
        System.out.println(checkPrime(n));
    }
}*/

//
/*public class Week2 {
    static int inverse(int n){
        int temp=0;
        while(n!=0){
            temp=temp*10 + n%10;
            n/=10;
        }
        return temp;
    }

    public static void main(String[]args){
        int n=9845;
        System.out.println(inverse(n));
    }
}*/

/*public class Week2 {
    static int digits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }

    public static void main(String[]args){
        int n=984533;
        System.out.println(digits(n));
    }
}*/

/*public class Week2 {
    static int count(int n){
        int count=0;
        while(n!=0){
            count++;
        }
        return count;
    }
    
    static boolean checkArm(int n){
        int d=count(n);
        int sum=0;
        int temp=n;
        while(n!=0){
            sum+=Math.pow((n%10),d);
            n/=10;
        }
        return (sum==temp);
    }
    

    public static void main(String[]args){
        int n=984;
        System.out.println(checkArm(n));
    }
}*/

/*public class Week2{
public static void main(String[]args){
    int[]arr=new int[10];
    arr[0]=1;
    System.out.println(arr[0]"");
}
}*/

/*public class Week2{
    static int printArr(int[] arr,int a,int b) {
        int Sum=0;
        for(int i=a;i<=b;i++) 
        Sum+=arr[i];
        return Sum;
       
    }
    
      public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int a=2;
        int b=4;
        printArr(arr,a,b);
        System.out.println(printArr+"");
    }
}*/

/*public class Week2{
    static int printRev(int[] arr) {
        for(int i=0;i<=arr.length;i--);
        System.out.print(arr+"");
    }
    
      public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        printRev(arr);
        System.out.println(printRev+"");
    }
}*/

/*public class Week2{
    static void printRev(int[] arr) {
        for(int i=0;i<=arr.length;i--);
        System.out.print(arr+"");
        System.out.println();

    }


    static void reverse(int[]arr){
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        temp[i]=arr[arr.length-1-i];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
    
      public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        reverse(arr);
        printRev(arr);
        System.out.println();
    }
}*/

/*public class Week2{
    static void reverseArr(int[] arr) {
        int[] arr =new int[10];
        int temp=0;
        while(arr!=0){
            temp=temp*10 + arr%10;
            n/=10;
        }
        return temp;
    }


    
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        reverseArr(arr);
        System.out.println(arr+"");
    }
}*/
    
    
    
        /*public static void sumArr(int[]arr){
        int sum=0;
        for(int i:arr)
        System.out.print(i+" ");
    }
}*/

/*public class Week2 {
    static int swapno(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println(a+""+b);
    }

    static void reverseusingswap(int[] arr){
        for(int a=0,j=arr.length-1,a<b,a--,b++){
            swap(arr,a,b);
        }

        public void  printArr(int[] arr){
            for(int i:arr)
            System.out.println(a+""+b);

        }


        public static void main(String[]args){
            int[]arr={1,3,5,6,7,8,9};
        int a=4;
        int b=6;
        swapno(arr,a,b);
        
    } 
}*/

import java.util.Scanner;
public class Week2 {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=scanner.nextInt();
        scanner.close();
        int odd=0,even=0;
        int r=0;int count=1;
        while(n!=0){
            r=n%10;
            n=n/10;
            if(count%2==0) {
                even=even+r;
                }
                else {
                    odd=odd+r;
                }
                count++;
            }
            System.out.println("sum of odd: "+odd);
            System.out.println("sum of even: "+even);
    }
}
    





        


