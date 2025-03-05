// Hirarchical Inheritance

class A
{
  void display()
  {
    System.out.println("This is JAVA.");
  }
}

class B extends A
{
  void display()
  {
    super.display();
    System.out.println("This is C++.");
  }
}

class C extends A
{
  void display()
  {
    
    System.out.println("This is PYTHON.");
  }
}

class D extends A
{
  void display()
  {
    
    System.out.println("This is C.");
  }
}



class HirarI
{
  public static void main(String args[])
  {
   B objB = new B();
   C objC = new C();
   D objD = new D();
   
   
   objB.display();
  
   
   objC.display();
   
   objD.display();
  }
}
 
