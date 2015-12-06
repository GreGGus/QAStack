/**
 * Created by debgreg on 03/12/15.
 */
public class main {


    public static void main(String[] args) {
        Lifo newStack = new Lifo(5);
        newStack.push(10);
        newStack.push(1);
        newStack.push(50);
        newStack.push(20);
        newStack.push(90);

        newStack.display();
        newStack.pop();
        newStack.pop();
        System.out.println("Test head : assert 50:"+newStack.head());
        newStack.pop();
        newStack.pop();
        newStack.display();
        newStack.push(11);
        newStack.push(12);
        newStack.display();
        newStack.pop();
        newStack.display();
    }
}
