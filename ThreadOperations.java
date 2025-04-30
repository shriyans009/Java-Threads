// ThreadOperations.java
// Optional helper class with reusable thread-based tasks

public class ThreadOperations {

    // Returns a thread that prints square of a number series
    public static Runnable squarePrinter(int start, int delay) {
        return () -> {
            try {
                int num = start;
                while (true) {
                    System.out.println(Thread.currentThread().getName() + " Square: " + (num * num));
                    num++;
                    Thread.sleep(delay);
                }
            } catch (InterruptedException e) {
                System.out.println("Square thread interrupted.");
            }
        };
    }
}
