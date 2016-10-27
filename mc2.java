import java.util.Scanner;

public class mc2 {

  public void counterMethod () {
    int counter = 0, i = 10;
    while (counter < i) {
      System.out.println("Counting " + counter);
      counter++;
    }
  }

  public void do_while () {
    int counter = 0, i = 10;
    do {
      System.out.println("This should only execute 3 times");
      counter++;
    }
    while (3 > counter); 
  }

  public void for_loop () {
    for (int i = 0; i < 5; i ++) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    mc2 hi = new mc2 ();
    hi.counterMethod();
    hi.do_while();
    hi.for_loop();


  }
}