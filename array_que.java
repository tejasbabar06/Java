import java.util.*;

public class array_que {
        public static boolean array_check(int array[]){
            for(int i=0;i<array.length;i++){
                for(int j=i+1;j<array.length;j++){
                    if(array[i] == array[j]){
                        return true;
                    }
                }
            }
            return false;
        }

    public static void main(String args[]){
        int array[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(array_check(array));

    }
}
