public class product {
  
  private String name;
  private int id;

  public product(){
    name = null;
    id = 0;
  }

  public product(product p) {
    name = p.name;
    id = p.id;
  }

  public void setName (String newName) {
    name = newName;
  }

  public String getName (){
    return name;
  }

  public int getID () {
    return id;
  }

  public void setProduct (String newName, int newID) {
    name = newName;
    id = newID;
  }

  public static void write (product p){
    System.out.println(p.getName() + p.getID());
  }

  public static void main(String[] args) {
    product p1 = new product();
    p1.setProduct("Bread", 10);
    product p2 = p1;
    p2.setProduct("wine", 11);
    p1.setProduct("fire", 12);
    product p3 = p2;
    p3.setProduct("fdf", 33);
    product p4 = p1;
    product.write(p1);
    product.write(p2);
    product.write(p3);
    product.write(p4);
    
  }
}