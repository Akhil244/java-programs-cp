import java.util.*;
public class countdigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //trick to find count of digits
        int c=(int)Math.log10(n)+1;
        System.out.println(c);
    }
}
