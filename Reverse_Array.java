import java.util.*;

public class Reverse_Array{

    public static void reverse(int array[]){
        int first=0,last=array.length-1;
        while(first < last){
            int temp=array[last];
            array[last]=array[first];
            array[first]=temp;
            first++;
            last--;
        }
    }



        public static void main(String args[]){
            int array[]={1,3,5,7,8,9,36,78,86,55};
            reverse(array);
            for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
            }

            


        }

}