import java.util.*;

public class Circumference {
  public static Double getCircumference(Double r){

       return 2 * 3.14 * r;

   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double r = sc.nextDouble();

       System.out.println(getCircumference(r));
   }
}
