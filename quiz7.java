public class quiz7 {

  public int[] intarray = new int[10];
  public double[] doublearray = {3,-4};
  public double[] dupe = doublearray;

  public void length() {
    System.out.println(doublearray.length);
    dupe[1] = 3;
    System.out.println(dupe[1]);
    System.out.println(doublearray[1]);
    doublearray[1] = 99;
    System.out.println(dupe[1]);
    System.out.println(doublearray[1]);

  }

  public static void main(String[] args) {
    quiz7 test = new quiz7();
    test.length();
  }
}