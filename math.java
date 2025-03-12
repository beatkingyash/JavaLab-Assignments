import java.lang.Math;

class math
{
  public static void main(String args[])
  {
    int a = 16;
    int b = 25;
    int d, e, f, g, h;
    
    double c;
    
    
    c = Math.pow(a, b);
    System.out.println("The power is: " + c);
    
    d = (int)Math.sqrt(a);
    System.out.println("The Square root of " + a + " is: " + d);
    
    e = (int)Math.sqrt(b);
    System.out.println("The Square root of " + b + " is: " + e);
    
    f = Math.min(a, b);
    System.out.println("The minimum number is: " + f);
    
    g = Math.max(a, b);
    System.out.println("The maximum number is: " + g);
    
   
  }
}
