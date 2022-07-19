import java.util.*;

public class Bigger {
  public static void greater(int a, int b){

       if(a > b){
           System.out.println(a + " is greater");
       } else {
           System.out.println(b + " is greater");
       }
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a: ");
       int a = sc.nextInt();
       System.out.println("Enter b: ");
       int b = sc.nextInt();

       greater(a, b);
   }
}
