// Create a second thread.
class NewThread implements Runnable {
 Thread t; String name;
  int st;

 NewThread(String name,int st) {
 // Create a new, second thread
 this.name=name; this.st=st;
 t = new Thread(this, "Demo Thread");
 
 System.out.println("Child thread: " + t);
 }
 // This is the entry point for the second thread.
 public void run() {
 try {
 for(int i = 5; i > 0; i--) {
 System.out.println("Child Thread " +name+":"+ i);
 Thread.sleep(st);
 }
 } catch (InterruptedException e) {
 System.out.println("Child interrupted.");
 }
 System.out.println("Exiting child thread.");
 }
}

class ThreadDemo1
{
  public static void main(String args[])
  {
   NewThread t1=new NewThread("Thread1", 500);
   t1.t.start();
  NewThread t2=new NewThread("Thread2",1000);
   t2.t.start();
 
  try
  {
    t1.t.join();
    t2.t.join();
  }
   catch(InterruptedException e1) {}
   System.out.println("Exiting main thread.");
 
   } 
 }
