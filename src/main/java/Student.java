public class Student {

  private String Name;
  private int Age;
  private String Sname;
  
  public Student(String name, String sname, int age) {
    Name = name;
    Sname = sname;
    Age = age;
  }

  public String GetName() {return Name;}
  public String GetSname() {return Sname;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Sname + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error","Parse Error",-1);
    return new Student(data[0],data[0], Integer.parseInt(data[1]));
  }
}