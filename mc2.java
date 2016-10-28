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

  public void test () {
    double num = 10.34566;
    int whole = (int)num;
    num = num - whole;
    while (num % 100 >= 99) {
      num = num / 100;
    }
    num *= 100;
    num %= 100;
    System.out.println(num);
    System.out.println(whole);
    System.out.println(whole + "." + (int)num);
  }

  public void tester () {
    Scanner hi = new Scanner(System.in);
    String ll = "hihi";
    ll = "dfkdfj";
    System.out.println(ll);

  }

  public static void main(String[] args) {
    mc2 hi = new mc2 ();
    hi.counterMethod();
    hi.do_while();
    hi.for_loop();
    hi.test();
    hi.tester();


  }
}