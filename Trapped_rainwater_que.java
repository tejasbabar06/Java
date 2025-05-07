import java.util.*;
public class Trapped_rainwater_que{


    public static int trappedrainwater(int array[]){
        int n=array.length;
        int leftMax[] = new int[n];
        leftMax[0]=array[0];

        for(int i=1;i<n;i++){
            leftMax[i]= Math.max(array[i],leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1]=array[n-1];

        for(int i=n-2;i >= 0; i--){
            rightMax[i]=Math.max(array[i],rightMax[i+1]);
        }

        int trapped_water=0;
        for(int i=0;i<n;i++){
            int water_level=Math.min(rightMax[i],leftMax[i]);
            trapped_water += water_level - array[i];
        }

        return trapped_water;
    }


    public static void main(String args[]) {
        int array[]={4,2,0,6,3,2,5};

        System.out.println(trappedrainwater(array));
    }
}