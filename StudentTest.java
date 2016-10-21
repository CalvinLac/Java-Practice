public class StudentTest {
  public static void main(String args[]) {

    Student calvin = new Student(); 
    calvin.newFeedback("A very good student");
    calvin.newFeedback("He will always finish his assignments on time");

    System.out.println(calvin.readFeedback());
  }
}