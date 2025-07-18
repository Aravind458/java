class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        this.threadName = name;
    }

    // The run() method contains the code that will be executed by the new thread
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Count: " + i);
                // Pause the thread for 1 second (1000 milliseconds)
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " has finished executing.");
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create two thread objects
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        // Start the threads. This calls the run() method.
        thread1.start();
        thread2.start();

        System.out.println("Main thread has finished its work.");
    }
}