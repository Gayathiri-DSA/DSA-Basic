/*
Missing And Repeating
Difficulty: Easy Accuracy: 24.83% Submissions: 584K+ Points: 2 Average Time: 30m
Given an unsorted array arr of positive integers. One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. 
Find numbers a and b.
Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n].
Problem Link :https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
*/
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[])
    {
        //Using Math -- > Algebra
        //X represent --> Repeating no 
        //Y represent --> Missing no
        long n = arr.length;
        
        //Sum of natural no's &square sum of natural no's
        long sn = (n*(n+1))/2;
        long s2n = (n*(n+1)* (2*n+1))/6;
        
        // initializing given sum and square sum of given array to 0
        long s = 0,s2 = 0;
        //Iterate thru arr
        for(int i=0;i<n;i++)
        {
            // get element from arraylist amd store it n var val
            long val =arr[i];
            
            // add/sum elem in given arr and its square
            s += val;
            s2 += val * val;
        }
        //Form Equation sum of given arr - sum of naturalnos 
        // x-y
        long val1 = s - sn; // Equation (1)
        
        // X^2 - Y^2 = (X - Y)(X + Y)
        long val2 = s2 - s2n; //Equation (2)
        
        // X + Y = (X^2 - Y^2) / (X - Y)
        val2 = val2 / val1;
        
        //To Find X:  X = ((X + Y) + (X - Y)) / 2
        long x = (val1 + val2) / 2;

        //To Find Y:  Y = X - (X - Y)
        long y = x - val1;
        
        //Store final result in ans var
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int)x); // Repeating number
        ans.add((int)y); // Missing number

        return ans;
        
    }
}
