/*
Stock Buy and Sell – Max one Transaction Allowed
Difficulty: EasyAccuracy: 49.33%Submissions: 71K+Points: 2Average Time: 10m
Given an array prices[] of length n, representing the prices of the stocks on different days. 
The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. 
Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.
Note: Stock must be bought before being sold.
Problem Link : https://www.geeksforgeeks.org/problems/buy-stock-2/1
*/
class Solution 
{
    public int maximumProfit(int prices[]) 
    {
        // Initialize maxProfit to 0 and minPrice to the highest possible value
         int maxprofit =0 ,minprice = Integer.MAX_VALUE;
        
         // iterate thru cost of stock each day
         
         for(int i=0;i<prices.length;i++)
         {
             //Buy @ minimum price using inbuilt math function to chose min price (start ,end)
             //Update the minimum price if a lower value is found
             minprice = Math.min(minprice,prices[i]);
             
             //Sell stock @ maxprofit ==> cost @ element - min price will give max profit
             //Calculate profit if we sell at the current price
             maxprofit=Math.max(maxprofit,prices[i]-minprice);
         }
         return maxprofit;
    }
}
