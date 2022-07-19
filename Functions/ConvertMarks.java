import java.util.*;

public class ConvertMarks {
  public static void grades(int marks){

       if (marks <= 100 && marks >= 91){
           System.out.println("Your grade is AA.");
       } else if (marks <= 90 && marks >= 81){
           System.out.println("Your grade is AB.");
       } else if (marks <= 80 && marks >= 71){
           System.out.println("Your grade is BB.");
       }  else if (marks <= 70 && marks >= 61){
           System.out.println("Your grade is BC.");
       }  else if (marks <= 60 && marks >= 51){
           System.out.println("Your grade is CD.");
       }  else if (marks <= 50 && marks >= 41){
           System.out.println("Your grade is DD.");
       }  else if (marks <= 40){
           System.out.println("Sorry, you have failed the exam.");
       } else {
           System.out.println("Invalid marks.");
       }
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your marks out of 100: ");
       int marks = sc.nextInt();

       grades(marks);
   }
}
