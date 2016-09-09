import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shalin on 9/6/2016.
 */
public class ThreeStacksInArrayTest {
    @Test
    public void push() throws Exception {
        ThreeStacksInArray s = new ThreeStacksInArray(5);
        s.push(0,2);
        s.push(0,1);
        assertEquals(1,s.pop(0));
    }

    @Test
    public void pop() throws Exception {
        ThreeStacksInArray s = new ThreeStacksInArray(5);
        s.push(0,2);
        s.push(0,1);
        s.pop(0);
        assertEquals(0,s.indexOfTop(0));
    }

    @Test
    public void peek() throws Exception {
        ThreeStacksInArray s = new ThreeStacksInArray(5);
        s.push(0,2);
        s.push(0,1);
        s.push(0,2);

        assertEquals(2,s.peek(0));
    }

    @Test
    public void isEmpty() throws Exception {
        ThreeStacksInArray s = new ThreeStacksInArray(5);
        s.push(0,2);
        s.push(0,1);
        s.push(0,2);
        s.pop(0);
        s.pop(0);
        s.pop(0);

        assertEquals(true,s.isEmpty(0));
    }

    @Test
    public void isFull() throws Exception {
        ThreeStacksInArray s = new ThreeStacksInArray(5);
        s.push(0,2);
        s.push(0,1);
        s.push(0,2);
        s.push(0,4);
        s.push(0,8);

        assertEquals(true,s.isFull(0));
    }

    @Test
    public void indexOfTop() throws Exception {
        ThreeStacksInArray s = new ThreeStacksInArray(5);
        s.push(0,2);
        s.push(0,1);
        assertEquals(1,s.indexOfTop(0));
    }

}