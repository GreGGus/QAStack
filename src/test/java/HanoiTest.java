import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * QAStack Tester.
 *
 * @author <Authors name>
 * @since <pre>déc. 3, 2015</pre>
 * @version 1.0
 */
public class HanoiTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    /**
     * Method: push(int value)
     */
    @Test
    public void testMove() throws Exception {
//TODO: Test goes here...
        HanoiTower hanoi = new HanoiTower(2);
        hanoi.toh(2);

        assertEquals(0,hanoi.towerLifo[1].getNumberOfElements());


    }
}