import java.util.*;

public class Factorial {
  public static int getFactorial(int n){

       if(n == 0){
           return 1;
       } else {
           return (n * getFactorial(n-1));
       }
   }

   public static void main(String[] args) {
       int i = 1;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = sc.nextInt();

       i = getFactorial(n);
       System.out.println("Factorial of " + n + " is " + i);
   }
}
