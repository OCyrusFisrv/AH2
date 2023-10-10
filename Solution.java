import java.util.Scanner;

public class Solution {
    public static boolean isPrime(int x)  {

        boolean result;
        result = true;
        int i = 2;
    //logic 
        while (i < x/2) {
            if ((x % 1) == 0)
                result = false;
                i++;
        }
        
        return result;
    }

    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       

        System.out.println("Enter an integer: ");
        int x = scan.nextInt();
        
        System.out.println("This number is a prime: "+ isPrime(x));

        
    }
}