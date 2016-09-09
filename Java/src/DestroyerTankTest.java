import org.junit.Test;
import sun.security.krb5.internal.crypto.Des;

import static org.junit.Assert.*;

/**
 * Created by shalin on 9/6/2016.
 */
public class DestroyerTankTest {
    @Test
    public void damage() throws Exception {
        DestroyerTank d = new DestroyerTank();
        d.setDamage(10);
        assertEquals(true,d.damage().contains("10"));
    }

    @Test
    public void setDamage() throws Exception {
        DestroyerTank d = new DestroyerTank();
        d.setDamage(10);
        assertEquals(10,d.damage);
    }

    @Test
    public void move() throws Exception {
        DestroyerTank d = new DestroyerTank();
        assertEquals(true,d.move().contains("15"));
    }

    @Test
    public void setDriver() throws Exception {
        DestroyerTank d = new DestroyerTank();
        assertEquals(true,d.setDriver("batman").contains("batman"));
    }

    @Test
    public void turnRight(){
        DestroyerTank d = new DestroyerTank();
        assertEquals(true,d.turnRight().contains("right"));
    }

    @Test
    public void turnLeft(){
        DestroyerTank d = new DestroyerTank();
        assertEquals(true,d.turnLeft().contains("left"));
    }

}