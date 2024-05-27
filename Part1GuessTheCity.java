import java.util.Scanner;

public class GuessTheCity {
// creating the two dimensional array that includes state and capital.
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
            totalScore++;
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