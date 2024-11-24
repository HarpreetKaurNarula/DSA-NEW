public class Spaceselect {
    static boolean check(int speed,int d,int t){
        int dist_travelled=speed*t{
            return(dist_travelled>=d);
        }
    }

    static int reachcenter(int d,int t){
        int low=0;
        int high=200;
        int optimalspeed=-1;
        while(low<=high){
            int mid=high-(high+low)/2;
            if(check(mid,d,t)){
                optimalspeed=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return optimalspeed;
    }
    public static void main(String[] args){
        int d=1000,t=2;
        System.out.println(reachcenter(d,t));
    }
}
    
   
