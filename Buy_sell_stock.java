/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
 You want to maximize your profit by choosing a single day to buy one stock and choosing a 
 different day in the future to sell that stock. Return the maximum profit you can achieve from 
 this transaction. If you cannot achieve any profit, return 0.*/


import java.util.*;
public class Buy_sell_stock{

    public static int buy_sell_stock(int array[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;

            for(int i=0;i<array.length;i++){
                if(buyprice < array[i]){
                    int profit= array[i] - buyprice;
                    maxprofit = Math.max(profit,maxprofit);
                }
                else{
                    buyprice = array[i];
                }
            }
            return maxprofit;
    }
    public static void main (String args[]){
        int array[]={7,1,5,3,6,4};
        System.out.print(buy_sell_stock(array));
    }
}