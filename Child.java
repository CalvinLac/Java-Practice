public class Child extends Parent {

  public String parentName;

  public Child (String pName, String name, int age){
    super(name,age);
    parentName = pName;
  }

  public Child (){
    super();
    parentName = "";
  }
}