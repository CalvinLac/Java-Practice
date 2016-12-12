public class Baby extends Child {
  public String childName;

  public Baby () {
    super();
    childName = "";
  }

  public Baby(String cName, String pNmae, String name, int age) {
    super(pNmae, name, age);
    childName = cName;
  }

  public static void main(String[] args) {
    Baby calvin = new Baby("a","b","c",20);
    System.out.println(calvin.parentName);
    System.out.println(calvin.name);
  }
}