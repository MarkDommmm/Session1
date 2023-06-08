import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner  = new Scanner(System.in);
       System.out.println("Enter Your Name: ");
       String name = scanner.nextLine();
       System.out.println("Enter Your Phone Number");
       String phone = scanner.nextLine();
       System.out.println("hello " + name +" MyPhone " + phone );

   }
}