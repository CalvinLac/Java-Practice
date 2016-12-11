public class Node {

  public int data;
  public Node next;

  public Node(int num) {
    data = num;
  }

  public Node getNext ()
  {
        return next;
  }

  public String toString ()
  {
        return Integer.toString(data);
  }

  public int getData() {
    return data;
  }

  public void setNext(Node n) {
    next = n;
  }

}