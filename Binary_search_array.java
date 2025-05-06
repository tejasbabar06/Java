import java.util.*;

public class Binary_search_array {
    
    public static int binary_search(int array[],int key){
        int start=0,end=array.length-1;

        while(start <= end){
            int mid= (start + end) / 2;
            if(array[mid] == key){
                return mid;
            }
            if(array[mid] < key){
                start=mid+1;
            }
            else{
                start=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]={1,3,4,7,34,78,97,99};
        int key=34;

        int result= binary_search(array,key);
        System.out.println("Index of number at key is : " +result);
    }
}
