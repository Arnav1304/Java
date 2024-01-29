package Lab2;
import java.util.Scanner;
public class large {
    public static void main (String[]args){
    int num1,num2,num3;
    Scanner input = new Scanner(System.in);
    num1=input.nextInt();
    num2=input.nextInt();
    num3=input.nextInt();
if(num1>num2&&num1>num3){
    System.out.println(num1);
}; 
if(num2>num1&&num2>num3){
    System.out.println(num2);
};        
if(num3>num1&&num3>num2){
    System.out.println(num3);
};
    input.close();
    }
}


    