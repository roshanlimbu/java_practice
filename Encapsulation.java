public class Encapsulation {
  private String name;
  private int age;
  private double gpa;

  public Encapsulation(String name, int age, double gpa) {
    this.name = name;
    this.age = age;
    this.gpa = gpa;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getGpa() {
    return gpa;
  }

  void setName(String name) {
    this.name = name;
  }

  void setAge(int age) {
    this.age = age;
  }

  void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public void displayInfo() {
    System.out.println("Name " + name);
    System.out.println("Age " + age);
    System.out.println("Gpa " + gpa);
  }

  public static void main(String [] args){
    Encapsulation student1 = new Encapsulation("Roshan", 21, 3.65);
    student1.displayInfo();
    System.out.println();
    Encapsulation student2 = new Encapsulation("Anish", 30, 3.5);
    student2.displayInfo();
  }

}
