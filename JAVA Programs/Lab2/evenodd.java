import java.util.Scanner;
public class evenodd{
    public static void main(String[] args){
        int i,even=0,odd=0;
        Scanner ip=new Scanner(System.in);
        System.out.println("enter 10 element");
        for(i=0;i<10;i++){
            int num=ip.nextInt();
            if(num%2==0){
                even++;
            }
            if(num%2!=0){
                odd++;
            }    

        }
        System.out.println(" even element "+even);
        System.out.println("odd element "+odd);

    }
}