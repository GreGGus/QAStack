/**
 * Created by debgreg on 04/12/15.
 */
public class Lifo extends StackAbstract {

    public Lifo(int arraySize)
    {
        size=arraySize;
        stack= new int[size];
        top=-1;
    }

    @Override
    public  int head() throws IllegalStateException{
        return stack[top];

    }
    @Override
    public  int pop()throws IllegalStateException{

        int a;
        if(!isEmpty()) {
            a = top;
            top = top - 1;
            return stack[a];
        }
        else{
            throw new IllegalStateException("Don't");

        }
    }



}
