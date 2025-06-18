package practice;

//wait karna thread ka complete hone ka
//Wait for the thread to complete
public class JoinThread extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws InterruptedException {
    JoinThread joinThread = new JoinThread();
    JoinThread joinThread1 = new JoinThread();
    JoinThread joinThread2 = new JoinThread();
    joinThread.start();
    joinThread.join(1000);
    joinThread1.start();
    joinThread2.start();
  }
}
