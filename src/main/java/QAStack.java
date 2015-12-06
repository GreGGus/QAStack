import java.util.Arrays;

public class QAStack {



    protected int top;
    int size;
    int[] stack ;

    public QAStack(){}

    public QAStack(int arraySize){
        size=arraySize;
        stack= new int[size];
        top=-1;
    }

    public void push(int value){
        if(top==size-1){
            System.out.println("Stack is full, can't push a value");
        }
        else{

            top=top+1;
            stack[top]=value;
        }
    }

    public int pop(){
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

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        if(top+1==size)
        {
            return true;
        }else{
            throw new IllegalStateException("Illegal State Excepetion");
        }
    }

    public int head(){
        return stack[top];
    }

    public void display(){

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }
    public int getNumberOfElements(){

        return top+1;
    }

}