import java.util.*;
public class swap {
    public static void main(String[] args) {
        // using bit manipulation for swapping 2 nos
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
