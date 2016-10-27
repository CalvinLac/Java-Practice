import java.util.Scanner;

public class PassBy {
  
  private String name;

  PassBy () {
    name = "Calvin";
  }

  public static void changeName (PassBy obj) {
    obj.setName("Clac");
    obj = new PassBy();
  }

  public String getName () {
    return name;
  }

  public void setName (String newName) {
    name = newName;
  }

  public static void main(String[] args) {
    PassBy example = new PassBy();
    PassBy example2 = new PassBy();
    changeName(example);
    System.out.println(example.getName());
  }
}