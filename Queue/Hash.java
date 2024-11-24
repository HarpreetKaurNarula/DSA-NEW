package Queue;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class Hash {
    public static void main(String[]args){
    HashMap<Integer,Integer> hp=new HashMap<>();
    TreeMap<Integer,Integer> tp=new TreeMap<>();
    LinkedHashMap<Integer,Integer> lp=new LinkedHashMap<>();

    hp.put(2,20);
    hp.put(4,40);
    hp.put(3,30);
    hp.put(5,50);
    hp.put(6,60);
    hp.put(-5,50);


    tp.put(2,20);
    tp.put(4,40);
    tp.put(3,30);
    tp.put(5,50);
    tp.put(6,60);
    tp.put(-5,50);

    lp.put(2,20);
    lp.put(4,40);
    lp.put(3,30);
    lp.put(5,50);
    lp.put(6,60);
    lp.put(-5,50);
    
    System.out.print(hp);
    System.out.print(tp);
    System.out.print(lp);
    }
}




    

