package Lab2;
import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
    int []arr = new int[5];
    Scanner ip = new Scanner(System.in);
    int i,j,temp;
    System.out.println("Enter 5 numbers : ");
    for(i=0;i<5;i++){
        arr[i] = ip.nextInt();
    }
   for(i=0;i<5;i++){
    for(j=0;j<4;j++){
        if(arr[j+1]<arr[j]){
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
   }

   System.out.println("After sorting: ");
   for(i=0;i<5;i++){
    System.out.println(arr[i]);
}
    }
} 

