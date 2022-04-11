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
        System.out.println(username + ", how many bags do you plan to take with you?");
        int luggageCount = Integer.parseInt(input.nextLine());

        //Checking bag count
        if (luggageCount <= 2) {
            System.out.println("You seem mindful of fuel economy, your prudence will serve you on the red planet.");
        } else if (luggageCount > 2) {
            System.out.println("This isn't a luxury cruise on a private yacht.");
            System.out.println("Please limit your luggage to two items");
        }
        // Animal Prompt
        System.out.println("You are permitted to bring with you an animal companion with you.");
        System.out.println("Fortunately, due to some top secret tech, necessary exo-suits needed to survive the red planet and nano tech to rewire behavior allow for an expansive variety of companions.");

        //User animal companion
        String petType = input.nextLine();

        //Ask for its name.
        System.out.println("Very well, What is the name of your " + petType + "?");

        //User Gives name.
        String animalName = input.nextLine();

        //Cool intro to the pet
        System.out.println("As you brave the cold expanse of space and the perils of the red planet, " + animalName + " the " + petType + " will be at your side.");

        //Spaceship decor prompts
        System.out.println("Fortunately, NASA isn't wholly unsympathetic to your needs for what will likely be a six month journey.");
        System.out.println("Also, like most government organizations, NASA isn't afraid of spending inordinate amounts of cash for little to no reason.");
        System.out.println("You have a couple of options for decorating the ship.");
        System.out.println("Your options are:");
        System.out.println("  A.  Sleek, modern minimalism");
        System.out.println("  B.  Retro/vintage space age");
        System.out.println("  C.  SF Hippie Chic");
        System.out.println("  D.  Neo-gothic");

        //While loop to process different responses
        String style;
        while (true) {
            String styleChoice = input.nextLine();
            style = " ";

            if (styleChoice.equals("A")) {
                style = "modern";
                break;
            } else if (styleChoice.equals("B")) {
                style = "retro";
                break;
            } else if (styleChoice.equals("C")) {
                style = "psychedelic";
                break;
            } else if (styleChoice.equals("D")) {
                style = "neo-gothic";
                break;
            } else {
                System.out.println("That's not an option please try again.");
            }
        }

        //Final summary
        System.out.println("I can see it now:");
        System.out.println(username + " and " + animalName + " the " + petType + " venturing into the silent void of space...");
        System.out.println("in a " + style +" spacecraft.");
        System.out.println(username+" the time has come. Humanity's fate is in your hands.");
        System.out.println("You enter the craft with "+animalName+".");
        System.out.println("Prepare for launch.");
        System.out.println("5 ...");
        System.out.println("4 ...");
        System.out.println("3 ...");
        System.out.println("2 ...");
        System.out.println("1 ...");
        System.out.println("* LAUNCH INITIATED *");
    }
}

