package command;

public class MacFileSystemReceiver implements FileSystemReceiver {

  @Override
  public void openFile() {
    System.out.println("Opening file in Mac OS X");

  }

  @Override
  public void writeFile() {
    System.out.println("Writing file in Mac OS X");
  }

  @Override
  public void closeFile() {
    System.out.println("Closing file in Mac OS X");
  }

}
