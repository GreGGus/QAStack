import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;


/**
 * Created by debgreg on 07/12/15.
 */
public class FifoTest {

    @Test
    public void testPush() throws Exception {
//TODO: Test goes here...
        Fifo test = new Fifo(5);
        test.push(15);
        test.push(2);
        test.push(3);
        test.push(4);

        assertEquals(15,test.head());
    }

    @Test
    public void testHead() throws Exception {
        Fifo test = new Fifo(5);
        test.push(1);
        test.pop();
        test.push(2);
        test.push(3);
        test.pop();
        test.push(4);

        assertEquals(3,test.head());
    }

    @Test
    public void testPop() throws Exception {
        Fifo test = new Fifo(5);
        test.push(1);
        test.push(3);
        test.push(4);
        test.push(5);
        test.display();
        test.pop();
        test.display();
        //  assertEquals(5, test.getNumberOfElements());
        assertEquals(3,test.pop());
    }

}
