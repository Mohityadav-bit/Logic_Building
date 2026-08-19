// 11. Count and print the total number of digits in a given number. 
import java.util.Scanner;

public class L11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num>0){
            int digit = num%10;
            System.out.println(digit);
            count = count+1;
            num = num/10;
        }
        System.out.println("the total count of the given num is: "+count);
    }
}