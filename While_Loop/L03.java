// 3. Print all even numbers between 1 and 100. 
public class L03 {
    public static void main(String[] args){
        int i = 1;
        System.out.println("All even nums b/w 1 to 100");
        while(i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
