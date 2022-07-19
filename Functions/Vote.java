import java.util.*;

public class Vote {
  public static int legalAge(int age){

       if (age < 18){
           System.out.println("Not eligible to vote.");
       } else {
           System.out.println("Eligible to vote.");
       }

       return 0;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();

       legalAge(age);
   }
}
