import org.junit.Test;
import org.omg.PortableInterceptor.Interceptor;

import static org.junit.Assert.*;

/**
 * Created by shalin on 9/6/2016.
 */
public class CollectionsTest {
    @Test
    public void addStudents() throws Exception {
            Collections c = new Collections();
            c.addStudents("hello", 12);
            Integer i = new Integer(12);
            assertEquals(i,Collections.hmap.get("hello"));
    }

    @Test
    public void updateList() throws Exception {
        Collections c = new Collections();
        c.addStudents("hello",10);
        c.updateList("hello");
        Integer i = new Integer(9);
        assertEquals(i,Collections.hmap.get("hello"));
    }

}