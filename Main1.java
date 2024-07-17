import java.util.*;
class A{
void display()
{
    System.out.println("Hello");
}
}
class B extends A
{
  /*   void display()
    {
        System.out.println("World");
    }*/
}
class C extends B{
    void display()
    {
      System.out.println("Welcome");
    }
}
public class Main1 {
    public static void main(String[] args)
    {
        B obj=new B();
        obj.display();
    }
}
