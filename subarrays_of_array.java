import java.util.*;

public class subarrays_of_array {
           public static void print_subarray(int array[]){
                for(int i=0;i<array.length;i++){
                    for(int j=0;j<array.length;j++){
                        for(int k=i;k<=j;k++){
                            System.out.print(array[k]+ " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        print_subarray(array);
    }
}
