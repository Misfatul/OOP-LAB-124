package Assignment_01;
public class Exception6 {
    public static void main(String[] args) {
        Thread longSleepingThread = new Thread(() -> {
            try {
                // Simulating a long task with sleep
                System.out.println("Going to sleep...");
                Thread.sleep(10000);  // Sleep for 10 seconds
                System.out.println("Woke up normally!");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.err.println
        ("I was rudely interrupted while sleeping!");
            }
        });
        longSleepingThread.start();
        // Main thread will sleep for 2 seconds and
        // then interrupt the longSleepingThread
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) { }
        longSleepingThread.interrupt();
    }
}
