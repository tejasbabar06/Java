import java.util.*;

public class max_sum_subarray_by_prefix_sum {
           public static void print_subarray(int array[]){
            int prefix[]=new int [array.length];
            int max_sum=Integer.MIN_VALUE;
            int cur_sum=0;

                prefix[0]=array[0];
                for(int i=1;i<prefix.length;i++){
                    prefix[i]=prefix[i-1]+array[i];
                }

                for(int i=0;i<array.length;i++){
                    for(int j=0;j<array.length;j++){
                        cur_sum= i==0? prefix[j] : prefix[j] - prefix[i-1];
                        if(max_sum < cur_sum){
                            max_sum=cur_sum;
                        }
                    }
                }
                System.out.println("Max sum is "+ max_sum);
            }
    public static void main(String args[]){
        int array[]={1,-2,6,-1,3};
        print_subarray(array);
    }
}
