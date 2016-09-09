import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shalin on 9/1/2016.
 */
public class PizzeriaStackTest {

    @Test
    public void testPush(){
        Stack s = new Stack();
        String msg= "hello";
        s.push(msg);
        assertEquals(msg,s.top());
    }

    @Test
    public void testPop(){
        Stack s = new Stack();
        s.push("hello");
        s.push("amazing");
        s.push("world!");
        s.pop();
        assertEquals("amazing",s.pop());
    }

    @Test
    public void testTop(){
        Stack s = new Stack();
        s.push("Hello");
        assertEquals("Hello",s.top());
    }

    @Test
    public void testIsEmpty(){
        Stack s = new Stack();
        s.push("abc");
        s.pop();
        assertEquals(true,s.isEmpty());
    }

    @Test
    public void testIsFull(){
        Stack s = new Stack();
        s.push("abc");
        assertEquals(false,s.isFull());
    }

    @Test
    public void testSize(){
        Stack s = new Stack();
        s.push("abc");
        assertEquals(1,s.size());
    }




}