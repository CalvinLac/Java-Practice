public class stack {

  int topOfStackIndex;
  int sizeOfStack;
  int[] arr;

  public stack(int size){
    topOfStackIndex = 0;
    sizeOfStack = size;
    arr = new int[size];
  }

  public void push(int value) {
    if(topOfStackIndex < sizeOfStack){
      arr[topOfStackIndex] = value;
      System.out.println(arr[topOfStackIndex]);
      topOfStackIndex++;
    }
    else{
      System.out.println("Stack is full");
    }
  }

  public void pop() {
    topOfStackIndex--;
  }

  public static void main(String[] args) {
    stack s = new stack(5);
    s.push(4);
    s.push(4);
    s.push(4);
    s.push(4);
    s.push(4);
    s.pop();
    s.push(6);
    s.push(6);ds
  }

}