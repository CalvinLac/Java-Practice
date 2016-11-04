public class array {

  private String[] aStringArray = {"Calvin", "Bob", "LoL"};
  private int[] intArray = new int[5];

  public void getString() {
    for (int i = 0; i < aStringArray.length; i++) {
      System.out.println(aStringArray[i]);
    }
  }

  public void addingInt() {
    for (int i = 0; i < 5; i ++) {
      intArray[i] = i;
      System.out.println(intArray[i]);
    }
  }


  public static void main(String[] args) {
    array arr = new array();
    arr.getString();
    arr.addingInt();
  }
}