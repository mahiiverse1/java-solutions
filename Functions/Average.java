import java.util.*;

public class Average {
  public static int getAverage(int a, int b, int c){
       return (a + b + c)/3;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("First number: ");
       int a = sc.nextInt();
       System.out.print("Second number: ");
       int b = sc.nextInt();
       System.out.print("Third number: ");
       int c = sc.nextInt();

       int avg = getAverage(a, b, c);
       System.out.println("Average is : " + avg);
   }

}
