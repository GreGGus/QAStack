import java.util.*;

 

 /* Class TowerOfHanoiUsingStacks */

public class HanoiTower

{

    public static int N;

     /* Creating Stack array  */

    public static Stack<Integer>[] tower = new Stack[4];
    public static Lifo[] towerLifo = new Lifo[4];

    public  HanoiTower()
    {
        Scanner scan = new Scanner(System.in);

        tower[1] = new Stack<Integer>();


        tower[2] = new Stack<Integer>();


        tower[3] = new Stack<Integer>();

         /* Accepting number of disks */

        System.out.println("Enter number of disks");

        int num = scan.nextInt();


        N = num;

        towerLifo[1]=new Lifo(N);
        towerLifo[2]=new Lifo(N);
        towerLifo[3]=new Lifo(N);
        toh(num);

    }
    public static void main(String[] args)

    {

    HanoiTower hanoi = new HanoiTower();

    }


    public HanoiTower(int a){


        N = a;

        towerLifo[1]=new Lifo(N);
        towerLifo[2]=new Lifo(N);
        towerLifo[3]=new Lifo(N);
        toh(a);
    }

     /* Function to push disks into stack */

    public static void toh(int n)

    {

        for (int d = n; d > 0; d--) {
            towerLifo[1].push(d);
        }

        display();

        move(n, 1, 2, 3);

    }

     /* Recursive Function to move disks */

    public static void move(int n, int a, int b, int c)

    {

        if (n > 0)

        {

            move(n-1, a, c, b);

            int z = towerLifo[a].pop();

            towerLifo[c].push(z);
            display();

            move(n-1, b, a, c);

        }

    }

     /*  Function to display */

    public static void display()

    {

        System.out.println("  A  |  B  |  C");

        System.out.println("---------------");

        for(int i = N - 1; i >= 0; i--)

        {

            String d1 = " ", d2 = " ", d3 = " ";

            try

            {

                d1= String.valueOf(towerLifo[1].get(i));

            }

            catch (Exception e){

            }

            try

            {

                d2= String.valueOf(towerLifo[2].get(i));

            }

            catch(Exception e){

            }

            try

            {

                d3= String.valueOf(towerLifo[3].get(i));

            }

            catch (Exception e){

            }

            System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);

        }

        System.out.println("\n");

    }

}