package singleton;

public class SingletonExecution {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton.getDescription());
  }
}
