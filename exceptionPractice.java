import java.util.Scanner;

public class exceptionPractice { 

  public static void main(String[] args) {
      
    exceptionPractice e = new exceptionPractice();
    e.doIt();

  }

  public void doIt() {

    Scanner keyboard = new Scanner(System.in);

    try{ 

      System.out.println("Please enter the number for the numerator");
      int numer = keyboard.nextInt();

      System.out.println("Please enter the number for the denominator");
      int denom = keyboard.nextInt();

      System.out.println(numer/denom);

      if (denom == 0) 
        throw new Exception("Exception: zero denom");

      System.out.println(numer/denom);
    }

    catch(Exception e){

      System.out.println(e.getMessage());
      System.out.println("You have entered zero for the denominator, try again");
      giveSecondChance();

    }

  }

  public void giveSecondChance() {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the number for the numerator");
    int numer = keyboard.nextInt();

    System.out.println("Please enter the number for the denominator");
    int denom = keyboard.nextInt();

    if (denom == 0) 
      System.out.println("I gave you a second chance, its too late now, BYE");
      System.exit(0);

    System.out.println(numer/denom);

  }

}