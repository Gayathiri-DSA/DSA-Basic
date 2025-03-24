/*
Single Among Doubles
Difficulty: Medium Accuracy: 53.69% Submissions: 92K+ Points: 4 Average Time: 20m
Given a sorted array arr[] of n positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. 
Find the number occurring only once.
Problem Link :https://www.geeksforgeeks.org/problems/element-appearing-once2552/1
*/
class Sol
{
    public static int search(int n, int arr[]) 
    {
      //Better solution can be done using Hashing /Map --hashmap
      
      //Optimized solution : XOR --Bitwise operator is efficient as its Time complexity is of O(n)
      
      //logic : a ^ a = 0 ; a ^ 0 =0 (i.e same / numbers that appeared twice r eliminated --- if single number present and xor is done returns the number 
      //hence number that appeared once is found easily thru single iteartion in the arr 
      
      // intialize xor to 0
      int xor=0; 
      
      //iterate thru arr
      for(int i=0;i<arr.length;i++)
      {
          xor=xor ^ arr[i];
      }
      return xor;
    }
}

/*
Note :
    ***  //Brute Force Approach :two ptr
        
        //iterate thru arr i--points to /pick up  individual element
        for (int i = 0; i < arr.length; i++) 
        {
            // initialize counter to 0 as it tracks the once and twice
            int count = 0; 
            
            //iterate thru arr j--loops thru arr
            for (int j = 0; j < arr.length; j++) 
            {
                //check if elem @ i&j == if so increase the count so that all elements eventually have count twice except for one which appeared once
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            
            // To chck number appeared once : the counter should be ==1 then rreturn element @ that position of i
            if (count == 1)
            {
                return arr[i];
            }
        }
        // no single occurenece found then return -1;
        return -1;
*/
