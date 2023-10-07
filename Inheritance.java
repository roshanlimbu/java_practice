class Animal {
  void eat() {
    System.out.println("Animal eats.");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks.");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Dog obj = new Dog();
    obj.bark();
    obj.eat();
  }
}
