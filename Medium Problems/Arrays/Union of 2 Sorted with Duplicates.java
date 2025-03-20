/*
Union of 2 Sorted with Duplicates
Difficulty: MediumAccuracy: 31.39%Submissions: 434K+Points: 4Average Time: 20m
Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
Problem Link : https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays*/

class Solution 
{
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[])
    {
        //Using Collections
        
        //TreeSet is a SORTED, UNIQUE collection in Java that implements the SET interface 
        TreeSet<Integer> set = new TreeSet<Integer>();
        
        int i = 0;
        int j = 0;
        
        // As long as i < its arr length the loop runs
        while(i < a.length)
        {
            // since set does not allow duplicate elements it adds i in set ; then move i to nxt element by i++
            set.add(a[i]);
            i++;
        }
        // similarly as long as j is < its arr length loop runs
        while(j < b.length)
        {
            // Then add J to set then moves to next
            set.add(b[j]);
            j++;
        }
        

       //Convert TreeSet to ArrayList
       
       //TreeSet is a sorted set that does not allow duplicate elements and is not index-based, meaning you cannot access elements by index like in a List so converting it to arraylist
        ArrayList<Integer> unionarr = new ArrayList<Integer>(set);
        return unionarr;
    
    }
}

/*Note:
    **Union : set containing DISTINCT COMMON ELEMENTs that are present in either of the arrays.
    ** Set does not allow duplicates -- inorder to be union elements should be UNIQUE 
        ** TreeSet provide sorted order of elements --- union elements has to be Stored in ASCENDING ORDER 

    ** Two pointer Approach --- TIME LIMIT EXCEEDED
    // Initialising variables
     int n1=a.length;
     int n2=b.length;
     
     int i=0;
     int j=0;
     
     //Using ArrayList to Store union elements in unionarr var
     ArrayList<Integer> unionarr =new ArrayList<>();
     
     //check : i & j should be < than their respective array length/size 
     while(i<n1 && j<n2)
     {
         // if i < j put i in unionarr since union arr have to return sorted unionarr store ele in ascending order
         if(a[i] <= b[j])
         {
             // Before i is stored in union arr check whether the union arr is empty -- if emty i is placed 
             // or if element is present then get that elemet stored at last  in unionarr check , it should != arr[i] 
             // since union does not allow duplicates enter/add the i after verifying both condition  then move pointer to nxt element by i++
             if(unionarr.isEmpty() || unionarr.get(unionarr.size()-1)!=a[i])
             {
                 unionarr.add(a[i]);
             }
             i++;
         }
         // what if j is smaller ? similar to i check both condition  then add j @ unionarr
         else
         {
             if(unionarr.isEmpty() || unionarr.get(unionarr.size()-1)!=b[j])
             {
                 unionarr.add(b[j]);
             }
             j++;
         }
     }
     // what if iteration thru i is over/exhausetd/done and elements still remain at j
     // As long as j < elements in its arr
     while(j<n2)
     {
         // similar to above check the condition and then add respective element to unionarr
         if(unionarr.isEmpty() || unionarr.get(unionarr.size()-1)!=b[j])
             {
                 unionarr.add(b[j]);
             }
     }
     //what if i has elements left but iteration thru j is done
     // As long as i < n1
     while(i<n1)
     {
         // check both condition and add respective ele in unionarr
       if(unionarr.isEmpty() || unionarr.get(unionarr.size()-1)!=a[i])
             {
                 unionarr.add(a[i]);
             }  
     }
     // then return the all elements available in both arr as unionarr 
     return unionarr;    */
