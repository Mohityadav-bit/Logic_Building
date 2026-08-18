import java.util.Scanner;

// 8. Calculate the sum of all odd numbers from 1 up to n. 

public class L08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("All the odd numbers b/w 1 to "+n);
        int i = 1;
        while(i<=n){
            if(i%2!=0){
                System.out.println(i);
                sum = sum+i;
            }
            i++;
        }
        System.out.println("The toatl sum of all the odd values are: "+ sum);      


    }
}
