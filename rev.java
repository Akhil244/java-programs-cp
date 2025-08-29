import java.util.*;
class rev {
    public static void main(String args[]){
        //extracting digit using % operator
        int n,rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            int r=n%10;
            //formula to calculate the rev of the number
            rev=rev*10+r;
            //removing the last occurence eg : 25559 is converted to 2555 and .....
            n/=10;

        }
        System.out.println(rev);
    }
}