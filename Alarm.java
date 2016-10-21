public class Alarm {

  public int second;
  public int minute;
  public int hour;

  Alarm () {
    second = 0;
    minute = 0; 
    hour = 0;
  }

  Alarm (int min, int hr) {
    this(0,min,hr);
  }

  Alarm (int sec, int min, int hr) {
    second = sec;
    minute = min;
    hour = hr;
  }

}
