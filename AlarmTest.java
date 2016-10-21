public class AlarmTest {
  public static void main(String args[]) {
    Alarm hi = new Alarm();
    System.out.println(hi.second);

    Alarm hihi = new Alarm(5,5);
    System.out.println(hihi.second);
    System.out.println(hihi.minute);

    Alarm bye = new Alarm(7,7,7);
    System.out.println(bye.second);
  }
}