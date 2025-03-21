/*
Missing in Array
Difficulty: Easy Accuracy: 29.59% Submissions: 1.3M Points: 2 Average Time: 15m
You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). 
This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.
Problem Link : https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays&difficulty=Basic,Easy,Medium&sortBy=submissions
*/
class Solution 
{
    int missingNumber(int arr[])
    {
        //This approach is using bitwise operator XOR
        
        // Intialize Var Xor to 0
        //Xor 1 represent all num's from 1 to n
        // xor 2 represent numbers in arr that contains missing number
        int xor1=0,xor2 =0;
        
        // N = total size of arr plus including missing number (i.e Natural num's N=5 then 1,2,3,4,5)
        int N=arr.length+1;
        
        // Iterate thru arr that contains missing number thru n-1 missing N 
        for(int i=0;i<arr.length;i++)
        {
            xor2 = xor2^arr[i]; //xor2 = 0 ⊕ 1 = 1
                                //xor2 = 1 ⊕ 2 = 3
                                //xor2 = 3 ⊕ 4 = 7
                                //xor2 = 7 ⊕ 5 = 2

            xor1=xor1^(i+1);  //xor1 = 0 ⊕ 1 = 1
                              //xor1 = 1 ⊕ 2 = 3
                              //xor1 = 3 ⊕ 3 = 0
                              //xor1 = 0 ⊕ 4 = 4

        }
        //intially iterate thru n-1 what if last element is the missing number to check that xor is done till N
        //Now xor1 correctly represents 1 ⊕ 2 ⊕ 3 ⊕ 4 ⊕ 5    N=5
        xor1=xor1^N;
        // actual values of xor 1 & 2 performs bitwise operation of xor ^ and produce missing number
        return xor1^xor2;
    }
}
/*Note:
    ** XOR : 
    XOR (^) is a bitwise operator in programming that operates on binary numbers. It follows these rules:

    **  2 logics -- same no. ^ same no. =0    ** num ^ 0 = num vice versa
    */
    
