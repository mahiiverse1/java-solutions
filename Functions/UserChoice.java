import java.util.*;

public class UserChoice {
  public static void main(String[] args) {
       int positive = 0;
       int negative = 0;
       int zero = 0;

       System.out.println("Press 1 to continue and 0 to end program.");
       Scanner sc = new Scanner(System.in);
       int status = sc.nextInt();

       while(status == 1){
           System.out.println("Enter a number: ");
           int num = sc.nextInt();
           if (num > 0){
               positive++;
           } else if(num < 0) {
               negative++;
           } else {
               zero++;
           }

           System.out.println("Press 1 to continue and 0 to end program.");
           status = sc.nextInt();
       }


       System.out.println("The process has ended successfully.");
       System.out.println("Ending stats: ");
       System.out.println("Positive numbers: " + positive);
       System.out.println("Negative numbers: " + negative);
       System.out.println("Zeroes: " + zero);
   }
}
