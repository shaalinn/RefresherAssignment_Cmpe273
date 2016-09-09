/**
 * Created by shalin on 8/31/2016.
 */
public class Queue {
    private String[] queue;
    private int size, front, rear;

    private int CAP = 15;

    public Queue(){
        queue = new String[CAP];
        size = 0;
        front = 0;
        rear = 0;
    }

    public Queue(int cap){
        if(cap == 0) {
            queue = new String[CAP];
            size = 0;
            front = 0;
            rear = 0;
        }
        else{
            CAP = cap;
            queue = new String[CAP];
            size = 0;
            front = 0;
            rear = 0;
        }

    }

    public void enQueue(String data) throws NullPointerException, IllegalStateException{
        if(size == CAP){
            throw new IllegalStateException("Queue is full: overflow");
        }
        else{
            size++;
            queue[rear] = data;
            rear = (rear+1)%CAP;
        }
    }

    public String deQueue() throws IllegalStateException{
        if(size == 0){
            throw new IllegalStateException("Queue is empty : underflow");
        }
        else{
            size--;
            String data = queue[(front%CAP)];
            queue[front] = null;
            front = (front+1)%CAP;
            return data;
        }
    }

    public boolean isEmpty(){return size == 0;}

    public boolean isFull() {return size == CAP;}

    public int size(){ return size;}

    public String toString(){
        String result = "[";
        for(int i=0;i<size;i++){
            result += queue[(front+i)%CAP];
            if(i<size-1){
                result +=", ";
            }
        }
        result += "]";
        return result;
    }
}
