public class AlarmTest {
  public static void main(String args[]) {
    Alarm hi = new Alarm();
    hi.readOutput();

    Alarm hihi = new Alarm(5,5);
    hihi.readOutput();

    Alarm bye = new Alarm(7,7,7);
    bye.readOutput();

    Alarm newer = new Alarm(1,1,1,1);
    newer.readOutput();
  }
}