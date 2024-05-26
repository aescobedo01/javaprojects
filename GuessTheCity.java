
/*asks user to enter a capital for U.S. states 
program reports incorrect/correct. 
Display current array contents 
ask user to enter answers for all state capitals
display the total correct count

50 states and their capitals are stored in a 
two-dimensional array in order by state name. 
bubble sort to sort content by capital.
user's answer is not case-sensitive. */

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;

//listing us states and their capitals
public static int getRandomElement(int[] arr){
    return arr[ThreadLocalRandom.current().nextInt(arr.length)];
}

class Assignment {
// It begins with the creation of the two dimension array that includes state and capital.
    public static void main (String[] args) throws IOException {
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
        }
    // iterating over an array 
    for (i = 0; i < ar.length; i++) { 
  
        // accessing each element of array 
        x = ar[i]; 
        System.out.print(x + " "); 
    } 
    }};

//asking the user a question about the capitals of us states
class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); //create a scanner object
        System.out.println("What is the capital of " + StateAndCapital[0] + "?");

        String cityInput = myObj.nextLine(); //read user input
        
        if cityInput = StateAndCapital[1] {
            System.out.println(cityInput + " is correct.");
        } else {
            System.out.println("The correct answer is " + StateAndCapital[1] + ".");
        }
    }

    //declare total correct 
Integer userScore = 0;
Integer totalScore = 0;

if (answerIsCorrect) {
    userScore++;
}
totalScore++
}
