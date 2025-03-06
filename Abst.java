// Abstract Class

abstract class SYA
{
  abstract void display();
}

class Abst extends SYA
{
  void display()
  {
    System.out.println("It is Abstract Class.");
  }
  
  public static void main(String args[])
  {
   Abst a = new Abst();
   a.display();
  }
}
