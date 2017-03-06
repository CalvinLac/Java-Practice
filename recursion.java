public class recursion {
  public void recur(int n) {
    if(n<1)
      return;

    recur(n-1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    recursion r = new recursion();
    r.recur(5);
  }
}