import java.util.Scanner;

public class exceptionPractice { 

  public static void main(String[] args) {
      
    Scanner keyboard = new Scanner(System.in);

    try{ 

      System.out.println("Please enter the number for the numerator");
      int numer = keyboard.nextInt();

      System.out.println("Please enter the number for the denominator");
      int denom = keyboard.nextInt();

      if (denom == 1) 
        throw new Exception("Exception: zero denom");

      System.out.println(numer/denom);
    }

    catch(Exception e){

      System.out.println("You have entered zero for the denominator");

    }

  }

}