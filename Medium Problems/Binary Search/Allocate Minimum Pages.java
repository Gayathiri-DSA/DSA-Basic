/*
Allocate Minimum Pages
Difficulty: Medium Accuracy: 35.51% Submissions: 260K+ Points: 4 Average Time: 35m
You are given an array arr[] of integers, where each element arr[i] represents the number of pages in the ith book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:

Each student receives atleast one book.
Each student is assigned a contiguous sequence of books.
No book is assigned to more than one student.
The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).
Problem Link : https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
*/
class Solution 
{
    public static int countStudents(int[] arr , int minpages)
    {
        //Initialize 1st student with 0 pages
        int students = 1 , pages = 0;
        
        //Iter thru arr of  book with pages
        for( int i =0 ; i<arr.length ; i++)
        {
            if(pages + arr[i] <= minpages)
            {
                 // update/add pages to current student
                 pages += arr[i];
            }
            else // >= min pages move to next student
            {
                students ++;
                pages = arr[i]; // move curr page to next student
            }
        }
        return students; 
    }
    public static int findPages(int[] arr, int k) 
    {
        //Edge case : when student exceeds books we will leave some student which crosses the constraint to address it return -1
        if( k > arr.length )
            return -1;
            
            //Range is b/w : max -- summation (arr) worst case 
            // max -- in order to allocate all student with atleast 1 book where mi nis used not all students get book
            // summation --> where only 1 student is present in that case all pages are added and allocated to student1
      int low = Arrays.stream(arr).max().getAsInt();
      int high = Arrays.stream(arr).sum();
      
      while( low <= high)
      {
          int mid = (low + high) /2;
          int students = countStudents(arr, mid);
          
          if ( students > k)
            {// Trim search space find min
                low = mid + 1;
            }
            else // student < k search right 
            {
                high = mid - 1;
            }
      }
      return low ;// low holds the minimum of (maximum pages)
    }
}

/*Note :
     Arrays.stream(arr) turns a primitive array (like int[]) into a Stream (specifically, an IntStream for int[]).

This allows you to use Stream API methods like:

sum()

max()

min()

filter()

map()

forEach() ...and more, in a clean, functional-style syntax.*/
