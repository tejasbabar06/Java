import java.util.*;

public class Kadanes_algorithim {
           public static void algo(int array[]){
            int ms=Integer.MIN_VALUE;
            int cs=0;
            for(int i=0;i<array.length;i++){
                cs += array[i];
                if(cs < 0){
                    cs = 0;
                }
                ms=Math.max(cs,ms);
            }
            System.out.println("Max sum is :" +ms);
           }
    public static void main(String args[]){
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        algo(array);
    }
}