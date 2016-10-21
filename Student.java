public class Student {
  private static String feedback = "";

  public static void newFeedback (String addedFeedback) {
    feedback += addedFeedback + "\n";
  }

  public static String readFeedback () {
    return feedback;
  }
}