// class to represent an emplayee - inherits Person
public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager m;
  public Employee(String firstName, String lastName, int age, double wage, int hours, String title)
  {
    super(firstName, lastName, age);
    hourlyWage=wage;
    hoursWorked=hours;
    jobTitle=title;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    return hoursWorked*hourlyWage;
  }
  public double getYearlySalary()
  {
    return hoursWorked*hourlyWage*52;
  }
  public String getJobTitle()
  {
    return jobTitle;
  }
  public String toString()
  {
    String out=super.toString()+": "+jobTitle+" @ "+this.getYearlySalary();
    return out;
  }
  public String getManager(Manager boss)
  {
    return boss.toString();
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int newHours)
  {
    hoursWorked=newHours;
  }
  public void setJobTitle(String title)
  {
    jobTitle=title;
  }
  public void giveRaise()
  {
    hourlyWage++;
  }
  public void setManager(Manager newManager)
  {
    m=newManager;
  }
}
  
