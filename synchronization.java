class SharedResource {
    private int count = 0;

    
    public synchronized void increment() {
        count++;
    }

    
    public int getCount() {
        return count;
    }
}


class WorkerThread extends Thread {
    private SharedResource sharedResource;
    private int increments;

    public WorkerThread(SharedResource sharedResource, int increments) {
        this.sharedResource = sharedResource;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            sharedResource.increment();
        }
    }
}
public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();   
        WorkerThread thread1 = new WorkerThread(sharedResource, 1000);
        WorkerThread thread2 = new WorkerThread(sharedResource, 1000);
        thread1.start();
        thread2.start();
        try {    
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Count: " + sharedResource.getCount());
    }
}
