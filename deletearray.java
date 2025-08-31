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

                /*
        Example walkthrough with input:
        5
        1 2 3 4 5
        2
        Step-by-step execution:
        Initial: a = [1,2,3,4,5], k = 0

        i=0: a[0]=1 != 2 → keep, copy to a[k] → a[0]=1, k=1
        i=1: a[1]=2 == 2 → skip copying, k remains 1
            // Important: the value 2 is ignored in the “new array” because we never copy it
        i=2: a[2]=3 != 2 → keep, copy to a[k] → a[1]=3, k=2
            // Notice how 3 overwrites the position where 2 was, effectively removing 2
        i=3: a[3]=4 != 2 → keep, copy to a[k] → a[2]=4, k=3
        i=4: a[4]=5 != 2 → keep, copy to a[k] → a[3]=5, k=4

        Final array to print: first k elements = [1,3,4,5]
        Output: 1 3 4 5

        Key Points:
        1. The removed value is never copied to the “new array” positions tracked by k.
        2. Valid elements overwrite positions of removed values if needed.
        3. The array is modified in-place.
        4. Only the first k elements are considered the new array after removal.
        */

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
