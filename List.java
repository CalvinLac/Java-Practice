public class List {

  private Node head;
  private Node end;

  public List() {
    head = null;
    end = null;
  }

  public void add (int num) {
    Node newNode = new Node(num);
    Node prev = null;

    if (head == null){
      head = newNode;
      end = newNode;
      return;
    }

    for (Node curr = head; curr != null; curr = curr.getNext()) {
      System.out.println(curr.toString());
      System.out.println(newNode.toString());
      if (curr.getData() >= newNode.getData()){
        if (curr == head)
          head = newNode;
        else
          prev.setNext(curr);
        newNode.setNext(curr);
        System.out.println("End");
        return;
      }
      System.out.println(curr.toString());
      System.out.println(newNode.toString());
      prev = curr;
      System.out.println(prev.toString());
    }
    System.out.println(newNode.toString());
    prev.setNext(newNode);
    end = newNode;
    System.out.println("END");
  }

  public String toString () {
   String str = "";
   for (Node curr = head; curr != null; curr = curr.getNext())
   {
       str += curr.toString() + ", ";
   }
   
   return str;
  }

}