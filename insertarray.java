import java.util.Scanner;
public class insertarray {
  public static void main(String args[]){
     //program involving assigning of the element at the aprticular position
      Scanner sc=new Scanner(System.in);
      int s=sc.nextInt();
      int a[]=new int[s];
      //read the array values
      for(int i=0;i<a.length;i++){
         a[i]=sc.nextInt();
      }
     //insert the array at particular pos
     int pos,ele;
     ele=sc.nextInt();
     pos=sc.nextInt();
     // eg considering s=4 and pos=2 => i=4-2= 2>=2 true then a[3]=a[2] assigning 2 to 3 
     for(int i=s-2;i>=pos;i--){
        a[i+1]=a[i];
     }
     a[pos]=ele;

     for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
     }
  }  
}
