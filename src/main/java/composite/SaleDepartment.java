package composite;

public class SaleDepartment implements Department {
  /** This is a leaf class
   * It just has to implement the department interface */
  private Integer id;
  private String name;

  public SaleDepartment(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public void printDepartmentName() {
    System.out.println(getClass().getSimpleName());
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
