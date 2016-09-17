import java.util.Scanner;

public class Calvin
{
  public static void main(String[] args)
  {
    int numberofeggs, numberofbaskets;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the amount of eggs in each basket, bud");
    numberofeggs = keyboard.nextInt();
    System.out.println("Enter the amount of baskets, bud");
    numberofbaskets = keyboard.nextInt();
    System.out.println("If you have");
    System.out.println(numberofeggs + "eggs per basket");
    System.out.println(numberofbaskets + "baskets, then");
    System.out.println("the total number of eggs is" + 
      (numberofeggs*numberofbaskets));

    System.out.println("When you take 2 eggs away from each basket");
    numberofeggs = numberofeggs - 2;
    System.out.println("There are" + numberofeggs + "per basket");
    System.out.println("And there are" + (numberofeggs * numberofbaskets) + "eggs in total");

  }
}