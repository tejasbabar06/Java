import java.util.*;
public class linear_search_array{
    public static int linearsearch(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array [i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int array[]={1,3,5,67,89,45,78,54,77,86};
        int key= 77;
    
        int result=linearsearch(array, key);
        
        if(result == -1){
            System.out.println("Element is not present in array");
        }

        else{
            System.out.println("Element is present at index : " + result);
        }
    
    }
}
