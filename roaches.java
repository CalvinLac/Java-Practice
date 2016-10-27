import java.util.Scanner;

public class roaches {
  public static void main(String[] args) {
   
    final double sizeRoaches = 0.3;
    final double growthRate = 1.95;
    int numWeeks = 0;
    double sizeHouse;
    double startingRoaches;
    int populationBugs;
    double spaceRoachesTake;


    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the size of your house in cubic inches");
    sizeHouse = keyboard.nextDouble();

    System.out.println("Please enter the number of roaches you think are ");
    System.out.print("in your house ATM");
    startingRoaches = keyboard.nextInt();

    System.out.println("As of right now you have " + startingRoaches + " in your house");
    spaceRoachesTake = startingRoaches * sizeRoaches;
    System.out.println("The roaches ATM take up " + startingRoaches * sizeRoaches + " inches of space");

    while (spaceRoachesTake < sizeHouse) {
      numWeeks ++;
      startingRoaches = startingRoaches * growthRate;
      spaceRoachesTake = startingRoaches * sizeRoaches;
    }
    System.out.println("After " + numWeeks + " weeks, you will have " + startingRoaches);
    System.out.print(" roaches in your house. They will take up " + spaceRoachesTake + " amount of space");


  }
}