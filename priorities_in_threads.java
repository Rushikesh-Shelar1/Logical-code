class my_thread extends Thread {
    public my_thread(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("Thank you " + this.getName());
            i++;
        }
    }
}

public class priorities_in_threads {
    public static void main(String[] args) {
        my_thread t1 = new my_thread("Piyush");// giving thread its name
        my_thread t2 = new my_thread("rakesh (most important)");
        my_thread t3 = new my_thread("mohit");
        my_thread t4 = new my_thread("suresh");
        my_thread t5 = new my_thread("radhika");
        t2.setPriority(Thread.MAX_PRIORITY);// setting priority of thread
        t4.setPriority(Thread.MIN_PRIORITY);// setting priority of thread
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}