import java.util.*;
public class Manager extends Employee
{
  private ArrayList<Employee> directReports=new ArrayList<Employee>();
  private String department;
  public Manager(String manFName,String manLName, int manAge, double manWage, int manHours, String manTitle, String manDepartment)
  {
    super(manFName, manLName, manAge, manWage, manHours, manTitle);
    department=manDepartment;
  }
  public String getDepartment()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports()
  {
    return directReports;
  }
  public String toString()
  {
    return "Manager: "+super.toString();
  }
  public void addDirectReport(Employee employee)
  {
    directReports.add(employee);
  }
  public void removeDirectReport(Employee employee)
  {
    directReports.remove(directReports.indexOf(employee));
  }
  public void setDepartment(String newDepartment)
  {
    department=newDepartment;
  }
  public boolean equals(Object o)
  {
    if(o instanceof Manager)
    {
      Manager other = (Manager) o;
      return directReports.equals(other.directReports) && department == other.department && super.equals(o);
    }
    else
    {
      return false;
    }
  }
}
