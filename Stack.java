/*public class Stack {
    public static void main(stk,item){
        if(stk.empty()){
            stk.push(item);
            return;
        }
    }
    int x=stk.pop();


    
}*/

public class Stack{
    public static void NGER(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int[] ans=new int[arr.length];

        for (int i=0;i<arr.length;i++){
            While(!stk.empty() && arr[i]> arr[stk.peek()])
            ans[stk.pop()]=arr[i];
            stk.push(i);
        }

        while(!stk.empty())
        ans[stk.pop()]=-1;

        display(ans);


    }
}