public class Alarm {

  private int second;
  private int minute;
  private int hour;
  private int swag;
  private static int hi = 0;

  Alarm () {
    second = 0;
    minute = 0; 
    hour = 0;
    swag = 0;
  }

  Alarm (int min, int hr) {
    this(0,min,hr,0);
  }

  Alarm (int sec, int min, int hr) {
    second = sec;
    minute = min;
    hour = hr;
    swag = 0;
  }

  Alarm (int sec, int min, int hr, int swag) {
    this(sec,min,hr);
    swag = 5;
  }

  public void readOutput() {
    System.out.println(second + "" + minute + "" + hour + "" + swag);
  }

}
