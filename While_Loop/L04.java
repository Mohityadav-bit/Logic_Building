// 4. Print all odd numbers between 1 and 100. 

public class L04{
    public static void main(String[] args){
        int i = 1;
        System.out.println("All the odd nums b/w 1 to 100");
        while(i<=100){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}