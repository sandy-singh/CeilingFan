import java.util.Scanner; // Import the Scanner class

//Room Class
public class Room {
  public static void main(String[] args)
  {
    Fan fan = new Fan(); //Fan Object
    Scanner userInputScanner = new Scanner(System.in); // Create a Scanner object to get user's input
    Fan.status(); //Show the current status of the fan
    
    //Start taking the user's inputs
    while (true){
        System.out.println("What would you like to do? (Enter the corresponsing number below:)\n1.Pull Speed Cord\n2.Pull Direction Cord\n3.Exit the Program");
        System.out.print("\nEnter here: ");
            
        //try/catch to catch any exceptions
        try{
            //record the response
            int response = userInputScanner.nextInt();
            
                //Housekeeping: Exit the program
                if(response == 3)
                {
                    System.out.println("Good-bye!");
                    userInputScanner.close();
                    break;
                }
            
                //Otherwise continue
                switch(response){
                    case 1: //if speed cord pulled
                        fan.pullSpeedCord();
                        break;
                    case 2: //if direction cord pulled
                        fan.pullDirectionCord();
                        break;
                    default:
                        System.out.println("\nPlease enter a valid number. Try Again!\n");
                        break;
                }
        }
        catch(Exception e) {
        // Handle errors/exceptions
        System.out.println("\nPlease enter a valid number. Try Again!");
        userInputScanner.nextLine(); //Clear Buffer
        fan.status();
            }
        }
    }
}