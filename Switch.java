import java.util.Scanner;

public class Switch {
  Scanner s = new Scanner(System.in);
  String override = "Calvin";
  int age = 0;

  public Switch(String message) {
    if(message.equals(override)) {
      age = 21;
    }
    else{
      System.out.println("You are not the Overlord");
    }
  }

  public void switchStatements() {
    System.out.println("Please enter your age");

    if(age != 21) {
      age = s.nextInt();
      age/=10;
      age*=10;
    }

    switch (age) {
      case 10:
        System.out.println("You're young");
        break;
      case 20:
        System.out.println("You're about my age");
        break;
      case 21:
        System.out.println("Welcome back Overlord");
        break;
      default:
        System.out.println("You're older than I am");
        break;
    }
  }

  public void controlLoops() {
    System.out.println("");
    System.out.print("Please enter the times you want to count: ");
    int numTimes = s.nextInt();

    for(int i = 0; i < numTimes; i++){
      System.out.println(i+1);
    }
  }

  public void whileLoop() {
    System.out.println("");
    System.out.print("Please enter the times you want to count: ");
    int numTimes = s.nextInt();

    int i = 0;
    while(i < numTimes) {
      System.out.println(i+1);
      i ++;
    }
  }

  public static void main(String[] args) {
    Switch test = new Switch(args[0]);
    test.switchStatements();
    test.controlLoops();
    test.whileLoop();
  }
}