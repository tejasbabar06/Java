import java.util.*;

public class max_sumof_subarray {
           public static void print_subarray(int array[]){
            int maxsum=Integer.MIN_VALUE;
            int cursum=0;
                for(int i=0;i<array.length;i++){
                    for(int j=0;j<array.length;j++){
                        for(int k=i;k<=j;k++){
                            cursum += array[k];
                        }
                        System.out.println(cursum);
                        if(maxsum < cursum){
                            maxsum = cursum;
                        }
                    }
                    System.out.println();
                }
                System.out.println(maxsum);
            }
    public static void main(String args[]){
        int array[]={1,2,-3,4,5,-6};
        print_subarray(array);
    }
}
