public class mc {
    private int h = 30;
    public int a = 3;
    public double s = 4.0;
    public String ayy = "Calvin is a boss";

    public void mddf () {
      int h = 44;
      System.out.println(h);
    }

    public void h () {
      System.out.println(h);
    }

    public void time () {
      System.out.println(a * s);
      int lol = (int)s;
      System.out.println(lol);
    }

    public void test () {
      System.out.println(++h * a);
    }

    public void string () {
      int position = ayy.indexOf("i");
      System.out.println(position);
      System.out.println(6 + 3 * 10 / 5);
    }

  public static void main(String[] args) {

    mc hihi = new mc();
    hihi.mddf();
    hihi.h();
    hihi.time();
    hihi.test();
    hihi.string();
  }
}