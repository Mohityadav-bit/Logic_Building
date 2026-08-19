// 15. Check whether the given number is an Armstrong number. 

import java.util.Scanner;

public class L14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int dup = num;
        int digit = 0;
        int sum = 0;
        while(num>0){
            digit = num%10;
            System.out.println(digit);
            sum = sum+(digit*digit*digit);
            num = num/10;
        }
        System.out.println(sum);
        if(dup == sum){
            System.out.println("The given number is the Armstrong number");
        }else{
            System.out.println("The given number is not the Armstrong number");
        }
    }
    
}
