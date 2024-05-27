import java.util.Scanner;

public class Part1GuessTheCity {
// creating the two dimensional array that includes state and capital.
    public static void main (String[] args) {
        String[][] stateCapitals = {
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

        // Display current contents of the array
        System.out.println("Current contents of the array:");
        displayArray(stateCapitals);

        // Sort the array by capital using bubble sort
        bubbleSortByCapital(stateCapitals);

        // Display the sorted array
        System.out.println("\nSorted array by capital:");
        displayArray(stateCapitals);

//score count
int userScore = 0;
int totalScore = 0;

Scanner myObj = new Scanner(System.in); //create a scanner object

    // iterating over the array  
    for (String[] stateCapitalPair : stateCapitals) { 

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

        // Method to display the contents of the array
        private static void displayArray(String[][] array) {
            for (String[] row : array) {
                System.out.println(row[0] + " - " + row[1]);
            }
        }
    
        // Method to sort the array by capital using bubble sort
        private static void bubbleSortByCapital(String[][] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j][1].compareToIgnoreCase(array[j + 1][1]) > 0) {
                        // Swap the elements
                        String[] temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
}