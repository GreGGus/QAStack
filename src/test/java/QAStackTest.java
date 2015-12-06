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
public class QAStackTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: push(int value) 
* 
*/ 
@Test
public void testPush() throws Exception {
//TODO: Test goes here...
    Lifo test = new Lifo(5);
    test.push(20);
    assertEquals(1,test.getNumberOfElements());
    assertEquals(20,test.head());
} 

/** 
* 
* Method: pop() 
* 
*/ 
@Test
public void testPop() throws Exception { 
//TODO: Test goes here...
    Lifo test = new Lifo(5);
    test.push(1);
    assertEquals(1,test.head());

    test.push(10);
    assertEquals(10,test.head());

    test.push(3);
    assertEquals(3,test.head());

    assertEquals(3,test.pop());

    assertEquals(2,test.getNumberOfElements());
} 

/** 
* 
* Method: isEmpty() 
* 
*/ 
@Test
public void testIsEmpty() throws Exception { 
//TODO: Test goes here...
    Lifo test = new Lifo(5);
    test.push(1);
    assertEquals(1,test.head());

    test.pop();
    assertEquals(true, test.isEmpty());
}

    /**
     *
     * Method: isEmpty()
     *
     */
    @Test
    public void testIsFull() throws Exception {
//TODO: Test goes here...
        Lifo test = new Lifo(5);
        test.push(1);
        assertEquals(1,test.head());

        test.push(2);
        assertEquals(2,test.head());

        test.push(3);
        assertEquals(3,test.getNumberOfElements());

        test.push(4);
        assertEquals(4,test.head());

        test.push(5);
        assertEquals(5,test.getNumberOfElements());

        assertEquals(true,test.isFull());

    }

    /**
     *
     * Method: getNumberOfElement()
     *
     */
    @Test
    public void testGetNumberOfElement() throws Exception {
//TODO: Test goes here...
        Lifo test = new Lifo(5);
        test.push(1);
        assertEquals(1,test.head());

        test.push(2);
        assertEquals(2,test.getNumberOfElements());

        test.push(3);
        assertEquals(3,test.head());

        test.pop();
        assertEquals(2, test.getNumberOfElements());
    }

    /**
* 
* Method: head() 
* 
*/ 
@Test
public void testHead() throws Exception { 
//TODO: Test goes here...
    Lifo test = new Lifo(5);

    test.push(10);
    assertEquals(10,test.head());

    test.push(11);
    assertEquals(11,test.head());
} 



    /**
     *
     * Method: display()
     *
     */
    @Test
    public void testGetSize() throws Exception {
//TODO: Test goes here...
        Lifo test = new Lifo(5);

        assertEquals(5, test.getSize());
    }


} 
