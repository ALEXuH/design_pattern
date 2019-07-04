package pattern.structural.decorator;

import java.io.*;

/** Created by ALEXuH on 2018/12/18 */
public class FileDataSource implements DataSource {

  private String fileName;

  public FileDataSource(String fileName) {
    this.fileName = fileName;
  }

  public void writeData(String data) {
    File file = new File(fileName);
    BufferedOutputStream out = null;
    try {
      out = new BufferedOutputStream(new FileOutputStream(file));
      out.write(data.getBytes(), 0, data.length());
      out.close();
    } catch (IOException exception) {
      System.out.println(exception.getMessage());
    } finally {
      try {
        out.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public String readData() {
    char[] data = null;
    File file = new File(this.fileName);
    try {
      BufferedReader read = new BufferedReader(new FileReader(file));
      data = new char[((int) file.length())];
      read.read(data);
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    return new String(data);
  }
}
