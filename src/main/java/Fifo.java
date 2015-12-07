/**
 * Created by debgreg on 04/12/15.
 */

public class Fifo extends StackAbstract
{
    private Lifo lifoOne;
    private Lifo lifoTwo;

    public Fifo(int arraySize)
    {
        lifoOne = new Lifo(arraySize);
        lifoTwo = new Lifo(arraySize);
    }

    /************************************************
     * display prints out the contents of the queue.
     ***********************************************/
    
    @Override
    public void display()
    {
        for(int i = 0; i <= lifoOne.top; i++)
        {
            System.out.print(lifoOne.stack[i]+ " ");
        }

        System.out.println();
    }
    
    /**
     * head looks at the head of the queue.
     * 
     * @return the integer at the head of the queue.
     * @throws IllegalStateException when attempting to look at the head of an empty queue.
     */

    @Override
    public  int head() throws IllegalStateException
    {
    	if (lifoOne.top > -1)	
    	{
    		return lifoOne.stack[0];
    	}
    	else
    	{
    		throw new IllegalStateException("Cannot look at the head because there is nothing in the queue.");
    	}
    }

  /************************************************************************************************
   * pop takes the contents of LIFO One and puts it in LIFO Two, which then pops its top element,
   * which was previously the bottom element of LIFO One. Then everything is put back in LIFO One.
   * 
   * @throws IllegalStateExceptoin when a pop is attempted on an empty queue.
   ***********************************************************************************************/

    @Override
    public int pop()throws IllegalStateException
    {
    	if (!isEmpty())
    	{
    		popHelper(lifoOne, lifoTwo);

        	// We now have the stack in inverted order in LIFO Two.
        	// We can pop the top element off, which was the bottom of LIFO One.

        	int poppedInt = lifoTwo.pop();

        	// Transfer everything back to LIFO One to prepare for future operations.

        	popHelper(lifoTwo, lifoOne);

        	return poppedInt;
    	}
        else
        {
            throw new IllegalStateException("Can't pop anything since the queue is empty.");
        }
    }

    /**
     * popHelper transfers one stack into another (in inverted order).
     * 
     * @param stack1 releases its elements.
     * @param stack2 adds elements previously in stack1.
     */
    
    private void popHelper(Lifo stack1, Lifo stack2)
    {
    	for (int count = 0; count <= stack1.top; count++)
    	{
    		stack2.push(stack1.stack[top]);
    		stack1.pop();
    	}
    }

    /**
     * push adds the given integer to the top of LIFO One.
     * 
     * @param x - the integer to add.
     */

    @Override
    public void push(int x)
    {
        lifoOne.push(x);
    }
}











