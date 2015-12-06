/**
 * Created by debgreg on 04/12/15.
 */
public class Fifo extends StackAbstract {

    private Lifo lifoOne;
    private Lifo lifoTwo;
    //TODO : A FAIRE

    public Fifo(int arraySize){

        lifoOne=new Lifo(arraySize);
        lifoTwo=new Lifo(arraySize);
        /*
        size=arraySize;
        stack= new int[size];
        top=-1;
        */
    }

    @Override
    public  int head() throws IllegalStateException{
        return stack[0];

    }

   // @Override
    public void push(int x)
    {

        lifoOne.push(x);


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











