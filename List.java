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

    Node prev = null;
    for (Node curr = head; curr != null; curr = curr.getNext()) {
      if (curr.getData() >= newNode.getData()){
        if (curr == head)
          head = newNode;
        else
          prev.setNext(newNode);
        newNode.setNext(curr);
        return;
      }
      prev = curr;
    }
    prev.setNext(newNode);
    end = newNode;
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