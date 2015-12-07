/**
 * Created by debgreg on 03/12/15.
 */
public class main {

    public static void main(String[] args) {

    	Fifo testFIFO = new Fifo(10);
    	
    	testFIFO.push(1);
    	testFIFO.push(2);
    	testFIFO.push(5);
    	testFIFO.pop();

    	testFIFO.head();
    	testFIFO.display();
    }
}
