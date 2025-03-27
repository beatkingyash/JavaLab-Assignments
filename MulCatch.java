// One Try Block and Multiple Catch Block


class MulCatch
{
  public static void main(String args[])
  {
    try
    {
      int a[]=new int[5];
      a[5]=30/0;
    }
    
    catch(ArithmeticException e)
    {
      System.out.println("Arithmetic Exception Occurs.");
    }
    
     catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Array Index Out Of Bounds Exception Occurs.");
    }
    
    /* catch(Exception e)
    {
      System.out.println("Parent Exception Occurs.");
    } */
    
     System.out.println("End of the Program.");
  }
}
