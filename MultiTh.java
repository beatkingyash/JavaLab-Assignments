// Multi Thread

class MultiTh extends Thread
{
  public void run()
  {
     System.out.println("Thread Is Running.");
  }
  
  public static void main(String args[])
  {
    MultiTh t1 = new MultiTh();
    t1.start();
  }
}
