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
    }
  }

  public static void main(String[] args) {
    List numList = new List();

    System.out.println(numList);

    numList.insert
  }
}