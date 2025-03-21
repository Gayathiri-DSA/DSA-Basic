/*
Union of Arrays with Duplicates
Difficulty: Easy Accuracy: 42.22% Submissions: 424K+ Points: 2 Average Time: 10m
Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.
The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.
Note: Elements of a[] and b[] are not necessarily distinct. 

problem link : https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1?page=2&category=Arrays&difficulty=Easy,Medium&sortBy=submissions
*/
class Solution {
    public static int findUnion(int a[], int b[]) {
        
        //using java collection : treset is used to store unique elemets in sorted order
        TreeSet <Integer> set =new TreeSet<>();
        
        // intializing i&j to 0
        int i=0;
        int j=0;
        //as long as i < its arr length it add elements to set and mve i to next 
        while(i<a.length)
        {
            set.add(a[i]);
            i++;
        }
        // similar to i , j follows same instead of using while loop for loop works fine
        while(j<b.length)
        {
            set.add(b[j]);
            j++;
        }
        
       // final answer: return its size in case to return the elements in set 
       // first  Convert Set to Array 
        /*int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        or -- yhis appreaoch might be TLE error
         result obtained in function is coverted to int and stored in reult
         int result=findunion(a,b)
         return result;*/
        
        
        return set.size();
    }
}
