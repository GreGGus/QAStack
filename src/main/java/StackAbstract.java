/**
 * Created by debgreg on 04/12/15.
 */
public abstract class StackAbstract {

    // Class abstract pour implementer une stack LIFO ou une FIFO

    protected int top;
    int size;
    int[] stack ;

    public void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(stack[i]+ " ");
        }

        System.out.println();
    }

    public int getSize()
    {
        return size;
    }

    public int getNumberOfElements()
    {
        return top + 1;
    }

    public boolean isFull()
    {
        return (top + 1 == size);
    }

    public boolean isEmpty()
    {
        return top == -1;
    }


    public  void push(int x) throws IllegalStateException
    {
        if(top == size - 1)
        {
            System.out.println("Stack is full, can't push a value");
        }
        else
        {
            top = top + 1;
            stack[top] = x;
        }
    }

    public abstract int head() throws IllegalStateException;
    public abstract int pop()throws IllegalStateException;
}
