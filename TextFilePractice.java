import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class TextFilePractice {

  public static void main(String[] args) {
    String file = "out.txt";
    String inFile = "in.txt";
    Scanner inStream = null;
    PrintWriter outStream = null;
    File readingFile = new File(inFile);
    String binaryFile = "numbers.dat";
    ObjectOutputStream binaryOutputStream = null;
    ObjectInputStream binaryReader = null;

    try {
      outStream = new PrintWriter(file);
      inStream = new Scanner(readingFile);
      binaryOutputStream = new ObjectOutputStream(new FileOutputStream(binaryFile));
      
      Scanner binaryWriter = new Scanner(System.in);
      for (int i = 0; i < 5; i++) {
        binaryOutputStream.writeInt(binaryWriter.nextInt());
      }
      binaryOutputStream.close();

      binaryReader = new ObjectInputStream(new FileInputStream(binaryFile));
      int anInt;
      do {
        anInt = binaryReader.readInt();
        System.out.println(anInt);
      } while (anInt >= 0);
      binaryReader.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("Error opening file");
      System.exit(0);
    }
    catch (IOException e) {
      System.out.println("Error creating binary file output");
      System.exit(0);
    }

    System.out.println("Enter in your lines of text");
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 3; i ++) {
      outStream.println(s.nextLine());
    }
    outStream.close();

    while (inStream.hasNextLine()) {
      System.out.println(inStream.nextLine());
    }
    inStream.close();
  }


}