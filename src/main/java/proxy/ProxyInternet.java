package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

  private Internet internet = new RealInternet();
  private static List<String> bannedSites;

  static {
    bannedSites = new ArrayList<String>();
    bannedSites.add("banned1.com");
    bannedSites.add("banned2.com");
    bannedSites.add("banned3.com");
    bannedSites.add("banned4.com");
  }

  /** request on proxy to connect to a website*/
  @Override
  public void connectTo(String serverHost) throws Exception {
    // restricting access to the site if it matches the list of banned sites
    if (bannedSites.contains(serverHost.toLowerCase())) {
      throw new Exception("Access Denied");
    }

    internet.connectTo(serverHost);
  }
}
