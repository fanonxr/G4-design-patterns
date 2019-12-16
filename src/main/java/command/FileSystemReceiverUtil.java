package command;

public class FileSystemReceiverUtil {
/* class just responsible for getting the type of file system to create,
* either mac or unix
* */
  public static FileSystemReceiver getUnderlyingFileSystem() {
    String osName = System.getProperty("os.name");
    System.out.println("Underlying OS is:" + osName);

    if (osName.contains("Windows")) {
      return new MacFileSystemReceiver();
    } else {
      return new UnixFileSystemReceiver();
    }

  }
}
