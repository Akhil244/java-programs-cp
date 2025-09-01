import java.util.*;
public class firlastoccur {

   // we can also use this code for finding the first and last occurences of the particular element in the array
   // as we know the inclusion principle if oyu want to count the nos btw intervals a and b
   // formula: b-a+1 or (larger-smaller+1)
   // we consider the left values only if the ok is true else we consider the values on the right
    public static int countfirstlastoccur(int arr[],int key,boolean ok){
        int ans=-1;
        int st=0,en=arr.length-1,m;
        while(st<=en){
            m=st+(en-st)/2;
            if(arr[m]==key){
                ans=m;
                if(ok){
                    en=m-1;
                }
                else{
                    st=m+1;
                }
            }
            else if(arr[m]<key){
                st=m+1;
            }
            else{
                en=m-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int s=arr.length;
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int first=countfirstlastoccur(arr, key,true );
        int last=countfirstlastoccur(arr, key, false);
         if (first == -1 || last == -1) {
            System.out.println(0); // key not found
        } else {
            int count = last - first + 1;
            System.out.println(count);
        }
    }
}
