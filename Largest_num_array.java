import java.util.*;
public class Largest_num_array {
    
    public static int largestnum(int array[],int largest){
        for(int i=0;i<array.length;i++){
            if( largest < array[i]){
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int array[]={1,2,65,3,5,387,5,45,35,33};
        int largest=Integer.MIN_VALUE;

        int result = largestnum(array,largest);
        System.out.println("Largest element is : " + result);
    }
}
