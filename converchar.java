import java.util.*;
public class converchar {
    public static void main(String[] args) {

        // we can use bit manipulation to convert a char to upper and lower case using a number as input
        // lower case start from a=97 all the way to like till z we can add 1 at a time to reach
        // uppr case start from A=65 all the way to z again one at a time
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // convert a char to uppercase
        char c=(char)(n&'_');
        // convert a char to lower case
        char c2=(char)(n|' ');
        System.out.println(c);
        System.out.println(c2);
    }
}
