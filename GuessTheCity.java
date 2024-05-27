/* part 2
store the pairs of each state and its capital in a Map using the HashMap function. 
Display the content of the Map, then use the TreeMap class to sort the map while 
using a binary search tree for storage. Next, your program should prompt the user 
to enter a state and it should then display the capital for the state.
 */

 import java.util.HashMap;
 import java.util.Scanner;
 import java.util.TreeMap;
 import java.util.Map;
 
 public class GuessTheCity {
 // creating the two dimensional array that includes state and capital
 
     public static void main (String[] args) {
         HashMap<String, String> stateAndCapital = new HashMap<>();
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

        // display content of the map
        System.out.println("Content of the Map:");
        displayMap(stateAndCapital);
 
         //create treemap form hshmap to sort by keys
         TreeMap<String, String> sortedStateAndCapital = new TreeMap<>(stateAndCapital);
 
                // display sorted map
                System.out.println("\nSorted map by state:");
                displayMap(sortedStateAndCapital);
        

         //user types in a state
         Scanner scanner = new Scanner(System.in);
 
         while(true) {
         System.out.println("Enter a state: ");
         String state = scanner.nextLine();
 
         //if user types in "exit", program ends
         if ("exit".equalsIgnoreCase(state)) {
             break; 
         } 
 
     //convert the users input to title case to match the formatted state names inside the map
     String[] words = state.split(" ");
     StringBuilder formattedStateBuilder = new StringBuilder();
     for (String word : words) {
     formattedStateBuilder.append(Character.toUpperCase(word.charAt(0)))
     .append(word.substring(1).toLowerCase())
     .append(" ");
     }
     String formattedState = formattedStateBuilder.toString().trim();
 
         //display the capital
         if (sortedStateAndCapital.containsKey(formattedState)){
             System.out.println("The capital of " + formattedState + " is " + sortedStateAndCapital.get(formattedState) + ".");
         } else {
             System.out.println("State not found.");
         }
     }
         scanner.close();
 }
      // method to display map content
      private static void displayMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

 }