import java.util.Scanner;

/**
 * Created by debgreg on 03/12/15.
 */
public class main {


	public static void main(String[] args) {



		System.out.println("1- Stack \n 2- Queue \n 3- Hanoi Tower");
		Scanner scan = new Scanner(System.in);


         /* Accepting number of disks */


		int num = scan.nextInt();

		switch (num)
		{
			case 1 :


				System.out.println("Stack lunch");
				Lifo newLifo = new Lifo(4);
				newLifo.push(1);
				newLifo.push(2);
				newLifo.push(3);
				System.out.print("Display :");
				newLifo.display();
				System.out.println("Pop :"+newLifo.pop());
				System.out.println("Head :" + newLifo.head());
				System.out.println("Display :");
				newLifo.display();
				break;



			case 2 : System.out.println("Queue Lunch");
				Fifo newFifo = new Fifo(4);
				newFifo.push(1);
				newFifo.push(2);
				newFifo.push(3);
				newFifo.push(4);
				System.out.print("Display :");
				newFifo.display();
				System.out.println("Pop :"+newFifo.pop());
				System.out.println("Head :" + newFifo.head());
				newFifo.display();

				break;
			case 3 : System.out.println("Hanoi");
				HanoiTower hanoi = new HanoiTower();
				break;
		}


	}
}
