import java.util.*;
public class twodimarray {
    public static void print2darray(int arr[][]){
        //printing the elements in array
      for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
      }
    }

    public static void insert2darray(int arr[][],int pos1,int pos2,int ele){
        // inserting the element at particular pos
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[pos1][pos2]=ele;
            }
        }
    }

    public static void delete2darraybyvalue(int arr[][],int val){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==val){
                    arr[i][j]=0;
                }
            }
        }
    }
    public static void deletebypos(int arr[][],int p1,int p2){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[p1][p2]=0;
            }
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
      // creating a 2d array and inserting elements with m rows and n cols
        int [][]arr=new int[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int ele=sc.nextInt();
                arr[i][j]=ele;
            }
        }
        System.out.println("Inserting element");
        int p1,p2,val;
        p1=sc.nextInt();
        p2=sc.nextInt();
        val=sc.nextInt();
        insert2darray(arr, p1,p2,val);
        System.out.println("printing element");
        print2darray(arr);
        System.out.println("deleting elements");
        int val2=sc.nextInt();
        delete2darraybyvalue(arr,val2 );
        System.out.println("printing again");
        print2darray(arr);
        System.out.println("deleting by pos");
        int pos3=sc.nextInt();
        int pos4=sc.nextInt();
        deletebypos(arr, pos3,pos4);
        System.out.println("printing again");
        print2darray(arr);
    }
}
