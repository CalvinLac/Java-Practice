public class array {

  public String[] aStringArray = {"Calvin", "Bob", "LoL"};

  public void getString () {
    for (int i = 0; i < aStringArray.length; i++) {
      System.out.println(aStringArray[i]);
    }
  }


  public static void main(String[] args) {
    array arr = new array();
    arr.getString();
  }
}