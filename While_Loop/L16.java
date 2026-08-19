// 16. Find the max digit in the given number. 

import java.util.*;

public class L16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int maxDigit = 0;
        while(number>0){
            int lastdigit = number%10;
            System.out.println(lastdigit);
            if(lastdigit>=maxDigit){
                maxDigit = lastdigit;
            }
            number = number/10;
        }
        System.out.println("Max Digit of the given number is: "+maxDigit);
    }
}