import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shalin on 9/1/2016.
 */
public class GenericStackMainTest {

    @Test
    public void testPush(){
        GenericStack<Integer> s = new GenericStack<Integer>();
        int msg= 10;
        s.push(msg);
        assertEquals(Integer.valueOf(10),s.pop());
    }

    @Test
    public void testPop(){
        GenericStack<String> s = new GenericStack<String>();
        s.push("hello");
        s.push("amazing");
        s.push("world!");
        s.pop();
        assertEquals("amazing",s.pop());
    }

    @Test
    public void testTop(){
        GenericStack<String> s = new GenericStack<String >();
        s.push("Hello");
        assertEquals("Hello",s.top());
    }

    @Test
    public void testIsEmpty(){
        GenericStack<Integer> s = new GenericStack<Integer>();
        s.push(1);
        s.pop();
        assertEquals(true,s.isEmpty());
    }

    @Test
    public void testIsFull(){
        GenericStack<Integer> s = new GenericStack<Integer>();
        s.push(17);
        assertEquals(false,s.isFull());
    }

    @Test
    public void testSize(){
        GenericStack<Integer> s = new GenericStack<Integer>();
        s.push(11);
        assertEquals(1,s.size());
    }

}