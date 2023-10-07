class Employee {
  int baseSalary = 15000;

  int salary() {
    return baseSalary;
  };
}

class Manager extends Employee {
  int salary() {
    return baseSalary + 5000;
  }
}

class Pa extends Employee {
  int salary() {
    return baseSalary + 1000;
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    Manager obj1 = new Manager();
    Pa obj2 = new Pa();
    int op1 = obj1.salary();
    System.out.println(op1);

    int op2 = obj2.salary();
    System.out.println(op2);
  }
}
