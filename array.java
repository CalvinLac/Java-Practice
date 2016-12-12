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

  public int getLength() {
    return intArray.length;
  }

  public void shallow() {
    int[] arr1 = {1,2,3,4};
    int[] arr2 = {5,6,7,8};
    arr1 = arr2;
    arr2[1] = 10;
    System.out.println(arr1[1]);
    System.out.println(arr2[1]);
  }

  public void deep() {
    int[] arr1 = {1,2,3,4};
    int[] arr2 = {5,6,7,8};
    arr1[0] = arr2[0];
    arr1[1] = arr2[1];
    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);
    arr2[0] = 1;
    arr2[1] = 2;
    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);
    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);
  }


  public static void main(String[] args) {
    array arr = new array();
    System.out.println(arr.getLength());
    arr.getString();
    arr.addingInt();
    arr.shallow();
    arr.deep();
  }
}