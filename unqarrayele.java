import java.util.*;
public class unqarrayele {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n]; 
       int s=a.length;
       for(int i=0;i<s;i++){
          a[i]=sc.nextInt();
       } 
       int r=0;

       // using bitwise xor we can find the unq element in the array 
       // if n^n occurs it becomes 0 else it will be the number itself which isnt repeated and unique
         // ---------------- Traversal Example ----------------
       // Suppose input array: [2, 4, 7, 9, 2, 4]
       // Pass 1: r = 0 ^ 2 = 2
       // Pass 2: r = 2 ^ 4 = 6
       // Pass 3: r = 6 ^ 7 = 1
       // Pass 4: r = 1 ^ 9 = 8
       // Pass 5: r = 8 ^ 2 = 10
       // Pass 6: r = 10 ^ 4 = 14
       // Now r = 14 (which is XOR of the two unique numbers 7 and 9)

       for(int i=0;i<s;i++){
          r^=a[i];
       }

        // Find any set bit in r (this bit differentiates the two unique numbers)
        // Step 3: Find a set bit in r
        // - We need to find a bit where the two unique numbers differ.
        // - Initialize bit = 0
        // - While loop: check each bit of r using (r >> bit) & 1
        // - Stop at the first position where the bit is set (1)
        //   considering the Example above : r = 14 -> (1110)
        //   bit = 0 → (1110 >> 0) & 1 = 0 → not set
        //   bit = 1 → (1110 >> 1) & 1 = 1 → found!
        // So, set = 1 → the numbers differ at bit position 1


       int set=0,bit=0;
       while(r!=0){
          if((r>>bit&1)!=0){
            set=bit;
            break;
          }
          bit++;
       }

        // Step 4: Partition the array into two groups
        // - Initialize r1 = 0
        // - Traverse array again
        // - For each element, if the 'set'-th bit is 1, XOR it into r1
        // Why this works:
        //   • The two unique numbers differ at this bit → they go into different groups
        //   • All duplicate numbers fall into the same group and cancel out
        // Example with set = 1:
        //   2 (0010) → bit1 = 1 → Group1
        //   4 (0100) → bit1 = 0 → Group2
        //   7 (0111) → bit1 = 1 → Group1
        //   9 (1001) → bit1 = 0 → Group2
        //   2 (0010) → bit1 = 1 → Group1
        //   4 (0100) → bit1 = 0 → Group2
        // Group1 = [2, 7, 2] → XOR = 7
        // Group2 = [4, 9, 4] → XOR = 9
        // So r1 = 7

       int r1=0;
       for(int i=0;i<s;i++){
          if((a[i]>>set&1)!=0){
             r1^=a[i];
          }
       }

        // Step 5: Get the other unique number
        // - r = 7 ^ 9
        // - n2 = r ^ r1 = (7 ^ 9) ^ 7 = 9
        // So final answer: 7 and 9

        // Step 6: Output
        // - Print the two unique numbers
       int n1=r^r1;
       int n2=n1^r;
      System.out.println(n1);
      System.out.println(n2);
    }
}