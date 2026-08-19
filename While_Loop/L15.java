// 16. Check whether the given number is a Perfect number. 
import java.util.*;
public class L15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i< number){
            
            if(number%i==0){
                System.out.println(i);
                sum = sum+i;
            }
            i++;
        }
        if(number != sum){
            System.out.println("not the Perfect number");
        }
        else{
            System.out.println("the Perfect number");
        }


    }
    
}
