import java.util.Scanner;
public class eveodd{

    // trick to perform eve odd without math
     public static boolean bit(int n,int b){
            int res=n&(1<<b);
            return res==0?false:true;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(bit(n,0)){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}