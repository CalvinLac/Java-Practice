public class Child extends Parent {

  public String parentName;

  public Child (String pName){
    parentName = pName;
  }

  public Child (){
    parentName = "";
  }

  public static void main(String[] args) {
    Child c = new Child("Calvin");
    System.out.println(c.parentName);
    System.out.println(c.name);
    System.out.println(c.age);
  }
}