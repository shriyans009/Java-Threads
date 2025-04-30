public class Main {
    public static void main(String[] args) {
        // Create two different threads with unique operations
        Thread thread1 = new Thread(new MyThread(1, 2, 500));     // Prints 1, 3, 5, ...
        Thread thread2 = new Thread(new MyThread(100, 20, 1000)); // Prints 100, 120, 140, ...

        // Name the threads for better output understanding
        thread1.setName("OddNumberThread");
        thread2.setName("IncrementBy20Thread");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
