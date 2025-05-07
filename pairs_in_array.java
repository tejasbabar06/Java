import java.util.*;

public class pairs_in_array{

        public static void print_pair(int array[]){
            for(int i=0;i<array.length;i++){
                int cur=array[i];
                for(int j=i+1;j<array.length;j++){
                    System.out.print("(" + cur + "," + array[j] + ")");
                }
                System.out.println();
            }
        }

    public static void main(String args[]){
        int array[]={1,2,3,4,5};

        print_pair(array);
    }

}