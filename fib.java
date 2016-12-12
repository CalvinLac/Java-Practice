import java.util.Scanner;

public class fib {
  int times = 0;
  int f = 1;
  int total = 1;

  public void fibber(int running) {
    System.out.println("hi");
    if (times > 5){
      return;
    }

    if (times == 0){
      total = f + total;
      f = total - f;
      times++;
      System.out.println(f);
      System.out.println(f);
      System.out.println(total);
      fibber(total);
    }

    if (times > 5){
      return;
    }
    else {
      total = running;
      total = f + total;
      f = total - f;
      times++;
      System.out.println(total);
      running = total;
      fibber(running);
    }
  }

  public static void main(String[] args) {
    fib f = new fib();
    f.fibber(0);
  }
}