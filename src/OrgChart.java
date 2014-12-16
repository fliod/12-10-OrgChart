public class OrgChart
{
  public static void main(String[] args)
  {
    Manager m1=new Manager("Ron", "Doe", 81, 100.0, 1, "IT manager", "IT");
    Manager m2=new Manager("John", "Don", 54, 50.0, 3, "Project manager", "Projects");
    Employee e1=new Employee("Jill", "Bill", 10, 20.0,1, "Janitor");
    e1.setManager(m1);
    Employee e2=new Employee("Sammy", "Johnson", 20, 30.0,2, "Senior Janitor");
    e2.setManager(m1);
    Employee e3=new Employee("Bill", "Jill", 30, 40.0,3, "Swag Janitor");
    e3.setManager(m1);
    e3.setManager(m2);
    printInfo(m1);
    printInfo(e1);
    printInfo(e2);
    printInfo(m2);
    printInfo(e3);
  }
  public static void printInfo(Person p)
  {
   if(p instanceof Manager)
   {
     Manager m=(Manager)p;
     System.out.println(m.getFirstName()+", "+m.getLastName()+", "+m.getAge()+", "+m.getWage()+", "+m.getHours()+", "+m.getJobTitle()+", "+m.getDepartment());
   }
   if(p instanceof Employee)
   {
     Employee e=(Employee)p;
     System.out.println("\t"+e.getFirstName()+", "+e.getLastName()+", "+e.getAge()+", "+e.getWage()+", "+e.getHours()+", "+e.getJobTitle());
   }
   else
   {
     System.out.println(p.getFirstName()+", "+p.getLastName()+", "+p.getAge());
   }
  }
}
