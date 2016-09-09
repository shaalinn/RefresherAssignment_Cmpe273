import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by shalin on 8/31/2016.
 */
public class MovieQueue {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Movie Box Office Queue:");
        System.out.println("Please enter the maximum number of persons to be allowed in queue:");
        int maxCap = 0;
        try {
             maxCap = sc1.nextInt();
            if (maxCap == 0) {
                throw new IllegalArgumentException("Queue cannot be of 0");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Queue q = new Queue(maxCap);

        int action;
        String person,continueChoice;

        do {
            System.out.println("Choose From:");
            System.out.println("1. Allow Person");
            System.out.println("2. Give out Ticket");
            System.out.println("3.Show Queue of Persons");

            action = sc1.nextInt();
            switch (action){
                case 1:
                    System.out.println("Enter persons name");
                    person = sc2.nextLine();
                    q.enQueue(person);
                    System.out.println("Person added: "+person);
                    break;
                case 2:
                    System.out.println("Tickets provided to: "+q.deQueue());
                    break;
                case 3:
                    System.out.println(q);
                    break;
                default:
                    System.out.println("Sorry Invalid Option");
            }
            System.out.println("Enter Y to continue or N to stop");
            continueChoice = sc2.nextLine();
        }while (continueChoice.equalsIgnoreCase("Y"));
        System.out.println("Thank you for choosing our service");

    }
}
