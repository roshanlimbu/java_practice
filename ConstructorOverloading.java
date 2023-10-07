public class ConstructorOverloading {
  void overloading() {
    System.out.println("No-argument constructor");
  }

  void overloading(int a, int b ) {
    int result = a+b;
    System.out.println(result);
  }

  public static void main(String[] args) {
    ConstructorOverloading obj = new ConstructorOverloading();
    ConstructorOverloading obj1 = new ConstructorOverloading();
    obj.overloading();
    obj1.overloading(5, 5);


  }
}
