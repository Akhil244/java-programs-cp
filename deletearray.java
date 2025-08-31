import java.util.*;

public class deletearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        
        int k = 0; 
        for (int i = 0; i < n; i++) {
            if (a[i] != val) {
                a[k] = a[i]; 
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
