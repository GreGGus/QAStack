/**
 * Created by debgreg on 03/12/15.
 */
public class main {

    public static void main(String[] args) {

    	Fifo testFIFO = new Fifo(10);
    	
    	testFIFO.push(1);
    	testFIFO.pop();
    	testFIFO.push(2);
    	testFIFO.push(3);
    	testFIFO.push(4);
    	testFIFO.pop();

    	testFIFO.head();
    	testFIFO.display();
    }
}
