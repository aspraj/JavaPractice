package practice;

public class MultiThreadingProgram extends Thread {
    public void run() {
      System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
      MultiThreadingProgram t = new MultiThreadingProgram(); // NEW
      System.out.println("State: " + t.getState());

      t.start(); // RUNNABLE
      System.out.println("State after start: " + t.getState());

      try {
        t.join(); // Waits for thread to finish
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("State after finish: " + t.getState()); // TERMINATED
    }
  }