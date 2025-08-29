import java.util.*;
public class fastexp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,pow;
        double res=1;
        n=sc.nextInt();
        pow=sc.nextInt();
        while(pow>0){
            if(pow%2!=0){
                res*=n;
            }
            pow/=2;
            n*=n;
        }
        System.out.println(res);
    }
}
