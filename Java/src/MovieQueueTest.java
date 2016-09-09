/**
 * Created by shalin on 8/31/2016.
 */
import org.junit.*;

import static org.junit.Assert.*;

public class MovieQueueTest {

    @Test
    public void testEnQueue(){
        Queue q = new Queue();
        String msg = "hello";
        q.enQueue(msg);
        assertEquals(msg, q.deQueue());
    }

    @Test
    public void testDeQueue(){
        Queue q = new Queue();
        q.enQueue("Hello");
        q.enQueue("Amazing");
        q.enQueue("World!");
        q.deQueue();
        assertEquals("Amazing",q.deQueue());
    }

    @Test
    public void testFull(){
        Queue q = new Queue(2);
        q.enQueue("q");
        q.enQueue("e");
        assertEquals(q.isFull(),q.size()==2);
    }

    @Test
    public void testEmpty(){
        Queue q = new Queue(2);
        q.enQueue("b");
        q.deQueue();
        assertEquals(q.isEmpty(),q.size()==0);
    }

    @Test
    public void testSize(){
        Queue q = new Queue(2);
        q.enQueue("b");
        q.enQueue("c");
        assertEquals(q.size(),2);
    }
}