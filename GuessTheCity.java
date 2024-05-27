/*asks user to enter a capital for U.S. states 
program reports incorrect/correct. 
Display current array contents 
repeat for all state capitals
display the total correct

50 states and their capitals are stored in a 
two-dimensional array in order by state name. 
bubble sort to sort content by capital.
user's answer is not case-sensitive. */

import java.util.Scanner;

public class GuessTheCity {
// creating the two dimensional array that includes state and capital.
    public static void main (String[] args) {
        HashMap<String, String> stateAndCapital; = new Hashmap<>();
        stateAndCapital.put("Alabama", "Montgomery");
        stateAndCapital.put("Alaska", "Juneau");
        stateAndCapital.put("Arizona", "Phoenix");
        stateAndCapital.put("Arkansas", "Little Rock");
        stateAndCapital.put("California", "Sacramento");
        stateAndCapital.put("Colorado", "Denver");
        stateAndCapital.put("Connecticut", "Hartford");
        stateAndCapital.put("Delaware", "Dover");
        stateAndCapital.put("Florida", "Tallahassee");
        stateAndCapital.put("Georgia", "Atlanta");
        stateAndCapital.put("Hawaii", "Honolulu");
        stateAndCapital.put("Idaho", "Boise");
        stateAndCapital.put("Illinois", "Springfield");
        stateAndCapital.put("Indiana", "Indianapolis");
        stateAndCapital.put("Iowa", "Des Moines");
        stateAndCapital.put("Kansas", "Topeka");
        stateAndCapital.put("Kentucky", "Frankfort");
        stateAndCapital.put("Louisiana", "Baton Rouge");
        stateAndCapital.put("Maine", "Augusta");
        stateAndCapital.put("Maryland", "Annapolis");
        stateAndCapital.put("Massachusetts", "Boston");
        stateAndCapital.put("Michigan", "Lansing");
        stateAndCapital.put("Minnesota", "Saint Paul");
        stateAndCapital.put("Mississippi", "Jackson");
        stateAndCapital.put("Missouri", "Jefferson City");
        stateAndCapital.put("Montana", "Helena");
        stateAndCapital.put("Nebraska", "Lincoln");
        stateAndCapital.put("Nevada", "Carson City");
        stateAndCapital.put("New Hampshire", "Concord");
        stateAndCapital.put("New Jersey", "Trenton");
        stateAndCapital.put("New Mexico", "Santa Fe");
        stateAndCapital.put("New York", "Albany");
        stateAndCapital.put("North Carolina", "Raleigh");
        stateAndCapital.put("North Dakota", "Bismarck");
        stateAndCapital.put("Ohio", "Columbus");
        stateAndCapital.put("Oklahoma", "Oklahoma City");
        stateAndCapital.put("Oregon", "Salem");
        stateAndCapital.put("Pennsylvania", "Harrisburg");
        stateAndCapital.put("Rhode Island", "Providence");
        stateAndCapital.put("South Carolina", "Columbia");
        stateAndCapital.put("South Dakota", "Pierre");
        stateAndCapital.put("Tennessee", "Nashville");
        stateAndCapital.put("Texas", "Austin");
        stateAndCapital.put("Utah", "Salt Lake City");
        stateAndCapital.put("Vermont", "Montpelier");
        stateAndCapital.put("Virginia", "Richmond");
        stateAndCapital.put("Washington", "Olympia");
        stateAndCapital.put("West Virginia", "Charleston");
        stateAndCapital.put("Wisconsin", "Madison");
        stateAndCapital.put("Wyoming", "Cheyenne");

        //display hashmap content
        System.out.println("HashMap content: " + stateAndCapital);

        //create treemap form hshmap to sort by keys
        TreeMap<String, String> sortedStateAndCapital = new TreeMap<>(stateAndCapital);

        //display treemap content 
        System.out.println("TreeMap content: " + sortedStateAndCapital);
        
        //prompt user to entr a state
        Scanner scanner = new Scanner(System.in);
        System.out.ptintln("Enter a state: ");
        String state = scanner.nextLine();
    


        //bubble sort to sort content by capital
for (int i = 0; i < StateAndCapital.length - 1; i++) {
for (int j = 0; j < StateAndCapital.length - i - 1; j++) {
    if (StateAndCapital[j][1].compareTo(StateAndCapital[j + 1][1]) > 0){
        //swap stateandcapital[j] and stateandcapital[j+1]
        String[] temp = StateAndCapital[j];
        StateAndCapital[j] = StateAndCapital[j + 1];
        StateAndCapital[j + 1] = temp;
    }
}
}

//score count
int userScore = 0;
int totalScore = 0;

Scanner myObj = new Scanner(System.in); //create a scanner object

    // iterating over the array  
    for (String[] stateCapitalPair : StateAndCapital) { 

        System.out.println("What is the capital of " + stateCapitalPair[0] + "?");

        String cityInput = myObj.nextLine(); //read user input
        
        //ensure user input matches corresponding city
        //if user is correct, program will say they are correct
        //if user types "exit", the program will end and display a final score
        //if user is incorrect, program will display correct answer
        //not case sensitive
        if (cityInput.equalsIgnoreCase(stateCapitalPair[1])) {
            System.out.println(cityInput + " is correct!"); 
            userScore++;
        }  else if ("exit".equalsIgnoreCase(cityInput)) {
            break;
        } else {
            System.out.println("The correct answer is " + stateCapitalPair[1] + ".");
        }
        totalScore++;
    }

    //display total correct
System.out.println(userScore + "/" + totalScore + " correct.");
    }
}
