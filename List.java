public class List {

  private Node head;
  private Node end;

  public List() {
    head = null;
    end = null;
  }

  public void add (int num) {
    Node newNode = new Node(num);
    if (head == null){
      head = newNode;
      end = newNode;
      return;
    }
  }

  public String toString () {
   String str = "";
   for (Node curr = head; curr != null; curr = curr.getNext())
   {
       str += curr.toString() + ", ";
   }
   
   return str;
  }

  public static void main(String[] args) {
    List numList = new List();
    numList.add(4);
    numList.add(4);
    numList.add(6);

    System.out.println(head.toString());

  }
}