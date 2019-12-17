package proxy;

public class ProxyExecution {
  public static void main(String[] args) {
    Internet internet = new ProxyInternet();
    try {
      internet.connectTo("nosleep.org");
      internet.connectTo("abc.com");
      // cannot connect to this banned site
      internet.connectTo("banned1.com");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
