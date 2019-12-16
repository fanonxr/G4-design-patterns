package singleton;

public class SingletonThreadSafe {

  private static SingletonThreadSafe uniqueInstance;

  // this class can have more instance variables ...

  private SingletonThreadSafe() {}

  public static synchronized SingletonThreadSafe getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new SingletonThreadSafe();
    }
    return uniqueInstance;
  }

  /**
   * Just print out method to test.
   *
   * @return
   */
  public String getDescription() {
    return "I'm a thread safe Singleton!";
  }

}
