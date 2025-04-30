// MyThread.java
// Runnable implementation for performing arithmetic sequences in threads

public class MyThread implements Runnable {
    protected int init;       // Initial value
    protected int increment;  // Increment per iteration
    protected int delay;      // Delay between iterations in milliseconds

    // Constructor to initialize thread parameters
    public MyThread(int init, int increment, int delay) {
        this.init = init;
        this.increment = increment;
        this.delay = delay;
    }

    // The code that runs inside the thread
    public void run() {
        try {
            while (true) {
                // Display output from current thread
                System.out.println(Thread.currentThread().getName() + " Output: " + init);

                // Update the value
                init += increment;

                // Pause for a while
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}
