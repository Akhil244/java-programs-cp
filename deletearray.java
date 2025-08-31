import java.util.*;
public class deletearray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int index = -1;   
        for (int i = 0; i < a.length; i++) {
            if (a[i] == val) {
                index = i; 
                break;     
            }
        }
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            // Step 7: Shift elements to the left starting from index
            // Traversal explanation:
            // Example: a = [2, 3, 5, 6, 7], val = 5
            // Found at index = 2
            // Now we shift:
            //    a[2] = a[3] → [2, 3, 6, 6, 7]
            //    a[3] = a[4] → [2, 3, 6, 7, 7]
            // Last element is duplicated, so we reduce the size logically.
            for(int i = index; i < a.length - 1; i++) {
                a[i] = a[i + 1]; 
            }
            for (int i = 0; i < a.length-1; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}