// 12. Reverse the given number and print the reversed value. 
// 13. Check whether the given number is a palindrome. 
import java.util.Scanner;

public class L12 {

    public static void checkPalindrome(int nnum, int rev_num){
        if(nnum != rev_num){
            System.out.println(" the given number is not a palindrome number");
        }
        else{
            System.out.println("the given number is the palindrome number");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int nnum = num;
        int rev_num = 0;
        while(num>0){
            int digit = num%10;
            System.out.println(digit);
            num = num/10;
            rev_num = rev_num * 10 + digit;
        }
        System.out.println("Reverse number is: "+rev_num);  
        checkPalindrome(nnum, rev_num);

    }
}
