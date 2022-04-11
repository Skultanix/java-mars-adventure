//Importing the scanner utility
import java.util.Scanner;
//Iporting InputMismatchException utility to regulate input errors
import java.util.InputMismatchException;


//Set up of the class "Mars
public class Mars {
    public static void main(String[] args)  {
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
        System.out.println("Hello "+username+". Welcome to the Mars Adventure Game.");
        System.out.println("Here's the deal. NASA has spotted movement on Mars, and by movement we mean alien forces mobilizing for an invasion of Earth.");
        System.out.println("You've been selected to go to Mars for reconoscence and perhaps sabotage. (Lucky you.)");

    }
}
