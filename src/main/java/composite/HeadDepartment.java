package composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
  /**
   * This is a composite level class because
   * it contains a list of Department type objects */

  private Integer id;
  private String name;

  private List<Department> childDepartments;

  public HeadDepartment(Integer id, String name) {
    this.id = id;
    this.name = name;
    this.childDepartments = new ArrayList<>();
  }

  /**
   * for each department that the head department leads
   * print the department name.
   * */
  public void printDepartmentName() {
    childDepartments.forEach(Department::printDepartmentName);
  }

  public void addDepartment(Department department) {
    childDepartments.add(department);
  }

  public void removeDepartment(Department department) {
    childDepartments.remove(department);
  }
}
