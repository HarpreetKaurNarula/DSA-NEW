/*find the Maximum Occuring element in a Sorted String*/
/*public class ST {
    static char Maxocc1(String s){
        int countCurrElement=0;
        char currElement='*';
        int countMaxElement=0;
        char maxElement='*';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=currElement){
                if(countCurrElement>countMaxElement){
                countMaxElement=countCurrElement;
                maxElement=currElement;
                }
                currElement=s.charAt(i);
                countCurrElement=1;
            }
            else{
                currElement++;
            }
        }
        if(countCurrElement>countMaxElement){
            countMaxElement=countCurrElement;
            maxElement=currElement;
        }
        return maxElement;
    }
    public static void main(String[] args){
        String original="aaabbbbbccddd";
        Maxocc1(original);
    }
}*/

/*find the maximum occuring element in a string */
public class ST {
    static char Maxocc2(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length;i++){
            arr(s.charAt(i)-'a')++;
        }
        int index=0;
        {
            for(i=1;i<arr.length;i++){
                if(arr[index]<arr[i]){
                    index=i;
                }
            }
            return(char)('a'+index);
        }
    }
    public static int main(String[] args){
        String original="bcdddrfgg";
        
    }

}



    


    /*static String reversewords(String s){
        
        String[] arr=s.split("\\s");
        for(int i=arr.length-1;i>=0;i--)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){

    }

    }*/
/*public class ST {
    static char maxocc2(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[index]<arr[i]){
                index=i;
            }
        }
        return(char)('a'+index);
    }
     public static void main(String[] args){

        
*/

        
/*function to check if a string is palindrome or not
    static String palindrome(String s1){
        String s2="";
        for(int i=0;i<=s2.length()-1;i++){
            s2+=s1.charAt(i);
        }
        return s2;
    }

/*function to check if a string is palindrome or not
public class ST {
    static boolean checkpal(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str= "detartrated";
        checkpal(str);
    }
}
*/
   
  







/*function to reverse a string
        String s1="potato";
        for(int i=s1.length()-1;i>=0;i--)
        System.out.print(s1.charAt(i));
    }
    
}*/


