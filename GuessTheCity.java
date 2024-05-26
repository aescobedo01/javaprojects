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
// It begins with the creation of the two dimension array that includes state and capital.
    public static void main (String[] args) {
        String[][] StateAndCapital = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };

            //score counters
Integer userScore = 0;
Integer totalScore = 0;

    // iterating over the array  
    for (String[] stateCapitalPair : StateAndCapital) { 
  
        Scanner myObj = new Scanner(System.in); //create a scanner object
        System.out.println("What is the capital of " + stateCapitalPair[0] + "?");

        String cityInput = myObj.nextLine(); //read user input
        
        //ensure user input matches corresponding city
        //not case sensitive
        if (cityInput.equalsIgnoreCase(stateCapitalPair[1])) {
            System.out.println(cityInput + " is correct."); 
            userScore++;
        } else {
            System.out.println("The correct answer is " + stateCapitalPair[1] + ".");
        }
        totalScore++;
    }


    //total number of correct answers
System.out.println(userScore + "/" + totalScore + " correct.");
    }
}
