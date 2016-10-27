import java.util.Scanner;

public class mc {
    private int h = 30;
    public int a = 3;
    public double s = 4.0;
    public String ayy = "Calvin is a boss";

    public void mddf () {
      int h = 44;
      System.out.println(h);
    }

    public void h () {
      System.out.println(h);
    }

    public void time () {
      System.out.println(a * s);
      int lol = (int)s;
      System.out.println(lol);
    }

    public void test () {
      System.out.println(++h * a);
    }

    public void string () {
      int position = ayy.indexOf("i");
      System.out.println(position);
    }

    public void cases () {
      Scanner keyboard = new Scanner(System.in);
      int answer;
      System.out.println("Please enter in your age group");
      answer = keyboard.nextInt();

      switch (answer) {
        case 10:
          System.out.println("Wow you're pretty young");
          break;
        case 20:
          System.out.println("Nice you're in the same age group as I am");
          break;
        case 30:
          System.out.println("Wow you're a lot older than I am ");
          break;
        default:
          System.out.println("Too old for me");
      }
    }

  public static void main(String[] args) {

    mc hihi = new mc();
    hihi.mddf();
    hihi.h();
    hihi.time();
    hihi.test();
    hihi.string();
    hihi.cases();
  }
}