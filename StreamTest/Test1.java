package StreamTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {

	public static void main(String[] args) {
		// Create a thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks to the pool
        for (int i = 0; i < 5; i++) {
            Runnable task = new WorkerThread("Task " + i);
            executorService.execute(task); // execute the task
        }

        // Shut down the pool
        executorService.shutdown();
    }
}

class WorkerThread implements Runnable {
    private String taskName;

    WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing " + taskName);
        try {
            Thread.sleep(1000); // Simulating task execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished " + taskName);
}

}
