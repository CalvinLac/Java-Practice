import java.util.Scanner;

public class MyException {

  public static void main(String[] args) {
    MyException c = new MyException();
    try {
      c.code();
    }
    catch(Exception e) {
      System.out.println("You cant divide by zero");
    }

  }

  public void code() throws Exception{
    Scanner s = new Scanner(System.in);
    int top = 40;
    int bottom = s.nextInt();

    if (bottom == 0) 
      throw new Exception();

    System.out.println(top / bottom);

  }

}