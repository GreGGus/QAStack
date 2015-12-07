/**
 * Created by debgreg on 04/12/15.
 */
public class Lifo extends StackAbstract {

    public Lifo(int arraySize)
    {
        size = arraySize;
        stack = new int[size];
        top = -1;
    }

    @Override
    public  int head() throws IllegalStateException
    {
        return stack[top];
    }

    @Override
    public int pop()throws IllegalStateException{

        int a;

        if(!isEmpty()) {
            a = stack[top];
            stack[top] = 0;
            top = top - 1;

            return a;
        }
        else {
            System.out.print("Vide");
            throw new IllegalStateException("Don't");
        }
    }

    public int get(int i)
    {
        return stack[i];
    }
}
