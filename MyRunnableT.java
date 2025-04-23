// Multi Thread

class MyRunnableT implements Runnable
{
  public void run()
  {
     System.out.println("Thread Is Running.");
  }
  
  public static void main(String args[])
  {
    MyRunnableT MyTask = new MyRunnableT();
    Thread t1 = new Thread(MyTask);
    t1.start();
  }
}
