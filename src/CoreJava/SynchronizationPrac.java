package CoreJava;

//Synchronization

//--------------------------------

/*
Synchronized block can be used to perform synchronization on
any specific resource of the method.Suppose we have 50 lines of code in our method,
but we want to synchronize only 5 lines, in such cases, we can use synchronized block.
*/

//If you make any static method as synchronized, the lock will be on the class not on object.

class Table 
{
 synchronized void printTable(int n) throws InterruptedException
 {
     for(int i=1;i<=10;i++)
     {
    	 System.out.println("hi");
         System.out.println(n + " * " + i + " = " + n*i);
         Thread.sleep(1000);
     }
 }
}
class Table2 extends Thread
{
 Table t=new Table();
 int n;
 Table2(int n)
 {
     this.n=n;
 }
 public void run() 
 {
     try{
         t.printTable(n);
     }
     catch(Exception e)
     {
         
     }
     
 }
}
class Table1 extends Thread
{
 Table t=new Table();
 int n;
 Table1(int n)
 {
     this.n=n;
 }
 public void run() 
 {
     try{
         t.printTable(n);
     }
     catch(Exception e)
     {
         
     }
 }
}
class SynchronizationPrac extends Thread {
 
 public static void main(String[] args) {
    
    Table1 h=new Table1(5);
    Table2 g=new Table2(6);
    h.start();
 //   try{
 //         h.join();
 //   }
 //   catch(Exception e)
 //   {
       
 //   }
    g.start();
 }
}