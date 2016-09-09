/**
 * Created by shalin on 9/7/2016.
 */
public class ThreadMain {

    public static void main(String[] args){
        MultiThreadingEven even = new MultiThreadingEven("Even");
        MultiThreadingOdd odd = new MultiThreadingOdd("Odd");
        even.start();
        odd.start();
    }

}
