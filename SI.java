// Single Inheritance

class A
{
  void display()
  {
    System.out.println("This is parent class.");
  }
}

class B extends A
{
  void display()
  {
    super.display();
    System.out.println("This is child class.");
  }
}

class SI
{
  public static void main(String args[])
  {
   B obj = new B();
   obj.display();
  }
}
