import java.io.*;


public class LLDriver {

  public static void main(String[] args) throws IOException {
    String filename = args[0];
    FileReader file = new FileReader(filename);
    BufferedReader buffer = new BufferedReader(file);

    List numList = new List();

    System.out.println(numList);

    String line = buffer.readLine();

    while (line != null) {
      numList.add(Integer.parseInt(line));
      line = buffer.readLine();
    }

    System.out.println(numList);
  }
}