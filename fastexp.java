import java.util.*;
public class fastexp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,pow;
        double res=1;
        n=sc.nextInt();
        pow=sc.nextInt();

        // lets consider the example of 2^7
        // result initialized to 1 (since anything power 0 = 1)
        // input: base number (n) and power (pow)
        // Example: if n = 2, pow = 7 (we want to compute 2^7 efficiently)
        // If the current power is odd, multiply result with the base
        // Example: 2^7 = 2 * (2^6)
        // Divide the power by 2 (integer division)
        // Example: pow = 7 → 3 → 1 → 0
        // Square the base
        // Example steps:
        // n = 2 → 4 → 16 → 256 (squaring each time)
        // Finally, print the computed result
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
