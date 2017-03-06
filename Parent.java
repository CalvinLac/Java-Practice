public class Parent {
  protected String name;
  protected int age;

  public Parent() {
    name = "";
    age = 0;
  }

  public Parent(String n, int a) {
    name = n;
    age = a;
  }

  public Parent(String n) {
    name = n;
    age = 0;
  }

  public Parent(int a) {
    name = "";
    age = a;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String n) {
    name = n;
  }

  public void setAge(int a) {
    age = a;
  }
}