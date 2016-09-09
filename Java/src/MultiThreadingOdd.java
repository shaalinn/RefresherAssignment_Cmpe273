/**
 * Created by shalin on 9/7/2016.
 */
public class MultiThreadingOdd implements Runnable {
    private Thread t;
    private String name;
    public int total;

    public MultiThreadingOdd(String name){
        this.total = 0;
        this.name = name;
        System.out.println("Creating "+ name);
    }

    @Override
    public void run() {
        int sum = 0;
        try {
            System.out.println("Running " + name);
            for (int i = 1; i < 100; i = i+2) {
                sum = sum +i;
                System.out.println("Thread: " + name + ", " + i);
                Thread.sleep(5);
            }

        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        System.out.println("Exiting from: "+name+" Thread");
        this.total = sum;
    }

    public void start(){
        System.out.println("Starting "+name);
        if(t==null){
            t = new Thread(this, name);
            t.start();
        }
    }
}
