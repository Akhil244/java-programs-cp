import java.util.*;
public class poweroftwo {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=n&(n-1);
        if(res==0){
            System.out.println("power of 2");
        }
        else{
            System.out.println("not power of 2");
        }
    }
}
