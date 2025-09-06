import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int low=0,high=a.length-1;
        int key=sc.nextInt();

        //logic for binary search begins
        // assume we have array with elements 1 2 3 4 5 with mid = 2 as 0+4/2=>4/2=2 index which has 3 as value
        // we know mid =2 index assume we wish to find element 4 => compare
        // a[mid]=> 3<4 => low=2+1=> 3 index check again
        // calculate the mid again => 3+4/2=>7/2=>3.5==3
        // we check the a[mid]=> a[3]=>4==4 true 
        //we return the index
        // => low=0,high=4 if we find the same one as key break => o(1)
        // if we wish to find the key which is present beside mid that means increment the low
        //=> the element is present to the left hand side of the mid 
        // we decrement the high and recalculate the mid value then check the conditions defined
        // t c of binary search is O(logn) since it deals with division of array into 2 parts and it does soon till n/2^k times which is more efficient compared to linear search
        // binary search only works on sorted array only it doesnt work on unsorted array since it deals with low and high paramenters 
        // low ones means left hand side of the array and high means right hand side of the array

        while(low<=high){

            // the formula was actually mid=(l+h)/2 but it results in overflow  
            // sometimes the values might exceede the datatype limit
            // in those cases we need to ensure that the value of mid stays at the exact limits or constraints defined
            // the formula can be revised as:
            // m=(l+h)/2 => (2l-l+h)/2 => (2l+h-l)/2 => l+(h-l)/2
            int mid=low+(high-low)/2;  
            if(a[mid]==key){
                System.out.println(mid);
                break;
            }
            else if(a[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}
