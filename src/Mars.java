//Importing the scanner utility
import java.util.Scanner;
//Iporting InputMismatchException utility to regulate input errors
import java.util.InputMismatchException;


//Set up of the class "Mars
public class Mars {
    public static void main(String[] args) {
        //Game initialization
        System.out.println("Mars Adventure initializing.");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Game initialized.");
        //User inputs their name here.
        System.out.println("Greetings, what is your name?");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        //Printing Game introduction
        System.out.println("Hello " + username + ". Welcome to the Mars Adventure Game.");
        System.out.println("Here's the deal. NASA has spotted movement on Mars, and by movement we mean alien forces mobilizing for an invasion of Earth.");
        System.out.println("You've been selected to go to Mars for recon and perhaps sabotage. (Lucky you.)");

        //Ask for User response to mission.
        System.out.println("Do you look forward to your mission? (y or n)");

        //Responsive feedback to user response
        while (true) {
            //Declare variable for response
            String missionMood = input.nextLine();

            if (missionMood.equals("y")) {
                System.out.println("Your ancestors smile on your courage. A fate in Valhalla seems likely");
                break;
            } else if (missionMood.equals("n")) {
                System.out.println("Your wariness of the dangerous unknown is prudent, albeit uninspiring.");
                break;
            } else {
                System.out.println("Invalid response please try again.");
            }
        }

        //Beginning Luggage questions
        //Asking about luggage
        System.out.println(username+", how many bags do you plan to take with you?");
        int luggageCount = input.nextInt();

        //Checking bag count
        if (luggageCount <= 2) {
            System.out.println("You seem mindful of fuel economy, your prudence will serve you on the red planet.");
        } else if (luggageCount > 2) {
            System.out.println("This isn't a luxury cruise on a private yacht.");
            System.out.println("Please limit your luggage to two items");
        }


    }
}

