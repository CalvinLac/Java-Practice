import java.util.Scanner;

public class ChangeCounter
{
  public static void main(String[] args)
  {
    int runningtotal, quarters, dimes, nickels, pennies;

    System.out.println("Hi, howmuch change do you have in your pockets?");
    Scanner keyboard = new Scanner(System.in);
    runningtotal = keyboard.nextInt();

    System.out.println("Cool, so you have " + runningtotal + " cents worth of change");

    quarters = runningtotal / 25;
    runningtotal = runningtotal % 25;
    dimes = runningtotal / 10;
    runningtotal = runningtotal % 10;
    nickels = runningtotal / 5;
    runningtotal = runningtotal % 5;
    pennies = runningtotal;

    System.out.println("The least amount of coins that you can have in your pocket is");
    System.out.println(quarters + " quarters");
    System.out.println(dimes + " dimes");
    System.out.println(nickels + " nickels");
    System.out.println(pennies + " pennies");

  }
}