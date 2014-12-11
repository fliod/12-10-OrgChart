// Super Class to represent a person
public class Person
{
  private String firstName;
  private String lastName;
  private int age;
  public Person()
  {
    firstName="";
    lastName="";
    age=0;
  }
  public Person(String firstnam, String lastnam,int setage)
  {
    firstName=firstnam;
    lastName=lastnam;
    age=setage;
  }
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public int getAge()
  {
    return age;
  }
  public void recordBirthday()
  {
    age++;
  }
  public String toString()
  {
    String s=lastName+", "+firstName;
    return s;
  }
}
