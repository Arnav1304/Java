import java.util.Scanner;
public class Intro {
    public static void main (String[]args){
    int num = 23;
    
    Scanner input = new Scanner(System.in);


 int[] nums = new int[10];

 int[][] nums2d = new int[5][10];
 
 int[] nums1 = {1,2,4,6,7}; 
  
 for(int i=0; i<nums.length; i++){
       nums[i] = Integer.parseInt(args[i]); 
    }
 int sum = 0;
 for(int i=0; i<nums.length; i++){
    sum += nums[i]; 
 }
 
 System.out.printf("The sum of the number is %d",sum);
}
}
