public class StudentTest {
  public static void main(String args[]) {

    Student calvin = new Student(); 
    calvin.newFeedback("A very good student");
    calvin.newFeedback("He will always finish his assignments on time");

    Student lac = new Student();
    lac.newFeedback("This is lac boi speaking");

    //No matter what object you call readFeedback on, it will return the class variable 
    //this() looks for a variable in an instance, but you cannot evoke it on a static variable
    //the reason why is because static variables do not belong to an object
    System.out.println(calvin.readFeedback());
    System.out.println(lac.readFeedback());
    System.out.println(Student.readFeedback());

  }
}