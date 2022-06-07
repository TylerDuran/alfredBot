import java.util.Date;
import java.util.*;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    // Guest greeting
    // Returns a greeting that includes the person's name. 
    // Inputs: String name 
    // Return Type: String 
    // Example Output: "Hello, Beth Kane. Lovely to see you."
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    // Date Announcement
    // Description: Returns a polite announcement of the current date and time.
    // Inputs: None
    // Return Type: String
    // Example Output: "It is currently Wed Aug 11 16:34:59 PDT 2022."
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return String.format("It is currently" + new Date());
    }
    
    // Respond Before Alexis
    // Description: AlfredBot will periodically process audio (Alfred is listening.) Write a method that accepts any string of conversation and responds appropriately.
    // Specifications:
        // If "Alexis" appears in the conversation (in the string) return a snarky response, such as, "Right away, sir. She certainly isn't sophisticated enough for that."
        // If "Alfred" is in the conversation return an obliging response, for example, "At your service. As you wish, naturally."
        // If neither name is found, return an appropriate response, for instance, "Right. And with that I shall retire."
    // Inputs: String conversation
    // Return Type: String
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        // Had to look at solution for help after 20 min
        if(conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } 
        if(conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

