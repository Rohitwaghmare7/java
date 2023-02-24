
import java.util.InputMismatchException;
import java.util.Scanner;
public class input {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
         try {
            System.out.println("Enter Integer Value: ");
            Integer inputInt = scanner.nextInt();
            System.out.println(inputInt);

         } 
         catch (InputMismatchException ex) {
            System.out.println("We have given input as float expecting integer "+ ex);
         }
   }
}

