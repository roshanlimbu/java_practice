public class MethodOverloading{
  public int add(int a ,  int b){  
    return a+b;      
  }
  public int add(int a ,  int b, int c){  
    return a+b +c;      
  }
  public static void main(String [] args){
    MethodOverloading obj = new MethodOverloading();
    int sum  = obj.add(5, 5);
    System.out.println(sum);


    int sum2  = obj.add(5,6, 5);
    System.out.println(sum2);
  } 
}
