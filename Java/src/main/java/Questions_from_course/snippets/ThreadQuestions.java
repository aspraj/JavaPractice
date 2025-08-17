package Questions_from_course.snippets;

//What will the following code output?

class Counter {

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    private int count = 0;
}

public class ThreadQuestions {
    public static void main(String[] args) throws
            InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}




/*
a synchronized increment() method to ensure thread safety.
❓ Why You Might Think It Should Be 1000 Instead of 2000:
Your thought:

        “We start the first thread, it increments to 1000, and then we start the second thread which sets it to 0 and starts counting again.”

But that’s not how object state and threading work:

The count field is part of the same Counter object shared by both threads.

Neither thread resets count to 0 at any point.

        t1.start() and t2.start() run concurrently — not one after the other. The program does not wait for t1 to complete before starting t2.

        🧵 Multithreading Reality:
When you call t1.start(), it schedules the thread to run — it does not block t2.start().

The OS scheduler can start them in any order or run them in parallel.

That’s why you use join() — to wait until both finish before printing the final count.

        Concept	Explanation
synchronized	Ensures thread-safe increment, avoids race conditions.
Shared object	Both threads use the same Counter object.
No reset to 0	No thread is resetting count, just incrementing.
Concurrent threads	Both threads run simultaneously, not sequentially.

        */


/*
if we didn't use the synchronized in the counter method then also the ans is same write

When increment() is not synchronized, it’s not thread-safe. Here's why:

count++ is not atomic. It consists of three steps:

Read the current value of count from memory

Increment the value

Write the incremented value back to memory

If two threads read count = 5 at the same time:

Both increment to 6

Both write 6 back

You've lost one increment!

➡️ This is called a race condition.

 */



/*
When increment() is synchronized:

Only one thread at a time can enter the method.

No two threads can simultaneously read and write count.

Ensures the count++ operation is effectively atomic.
 */