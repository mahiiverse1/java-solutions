import java.util.*;

public class MinMax {
  public static int max(int a, int b, int c){
       int largest = a;

       if(b > largest){
           largest = b;
       }

       if(c > largest){
           largest = c;
       }

       return largest;
   }

   public static int min(int a, int b, int c){
       int smallest = a;

       if(b < smallest){
           smallest = b;
       }

       if(c < smallest){
           smallest = c;
       }

       return smallest;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first no: ");
       int a = sc.nextInt();
       System.out.print("Enter second no: ");
       int b = sc.nextInt();
       System.out.print("Enter third no: ");
       int c = sc.nextInt();

       int max = max(a, b, c);
       int min = min(a, b, c);

       System.out.println("Largest of the three nos is: " + max);
       System.out.println("Smallest of the three nos is: " + min);

   }

}
