import java.util.*;

public class selection_sort{
   
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPost=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPost]>arr[j]){
                    minPost=j;
                }
            }
            int temp = arr[minPost];
            arr[minPost]=arr[i];
            arr[i]=temp;
        }
    }


    public static void print_array(int arr[]){
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
      }
    }

    public static void main(String args[]){
      int arr[]={8,6,4,7,6,3};
      selection_sort(arr);
      print_array(arr);
    }
}